package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.entidades.Produto;
import model.entidades.enums.Unidade;

public class ProdutoDAO extends DAO<Produto>  {

    @Override
    public void inserir(Produto produto) throws SQLException {
        executarConsultaDML("insert into produto(nome, descricao, preco_unitario, tipoproduto_id, registro_ativo, unidade)"
                + " values (?, ?, ?, ?, ?, ?)",
                produto.getNome(), produto.getDescricao(), produto.getPreco_unitario(),
                produto.getTipoproduto().getId(), produto.isRegistro_ativo() ? 1 : 0, produto.getUnidade().getCodigo());
    }

    @Override
    public void excluir(Produto produto) throws SQLException {
        executarConsultaDML("delete from produto where id = ?", produto.getId());
    }

    @Override
    public void alterar(Produto produto) throws SQLException {
        executarConsultaDML("update produto set nome = ?, descricao = ?, "
                + "preco_unitario = ?, unidade = ?, tipo_produto = ?, registro_ativo = ? where id = ?",
                produto.getNome(), produto.getDescricao(), produto.getPreco_unitario(),
                produto.getUnidade(), produto.getTipoproduto().getId(), produto.getId(), produto.isRegistro_ativo());
    }

    @Override
    public ArrayList<Produto> pesquisar(String filtro) throws SQLException {
        ArrayList<Produto> retorno = new ArrayList<>();
        ResultSet resultadoConsulta = executarConsultaSQL(
                "select * from produto where lower(nome) = ?",
                filtro.trim().toLowerCase());
        while (resultadoConsulta.next()) {
            Produto produto = new Produto();
            produto.setId(resultadoConsulta.getInt("id"));
            produto.setNome(resultadoConsulta.getString("nome"));
            produto.setDescricao(resultadoConsulta.getString("descricao"));
            produto.setPreco_unitario(resultadoConsulta.getDouble("preco_unitario"));
            produto.setRegistro_ativo(resultadoConsulta.getBoolean("registro_ativo"));
            produto.setTipoproduto(null);
            produto.setUnidade(Unidade.UN);
            
            retorno.add(produto);
        }

        return retorno;
    }
    
    @Override
    public ArrayList<Produto> listar() throws SQLException {
        ArrayList<Produto> retorno = new ArrayList<>();
        ResultSet resultadoConsulta = executarConsultaSQL(
                "select * from produto");
        while (resultadoConsulta.next()) {
            Produto produto = new Produto();
            produto.setId(resultadoConsulta.getInt("id"));
            produto.setNome(resultadoConsulta.getString("nome"));
            produto.setDescricao(resultadoConsulta.getString("descricao"));
            produto.setPreco_unitario(resultadoConsulta.getDouble("preco_unitario"));
            produto.setRegistro_ativo(resultadoConsulta.getBoolean("registro_ativo"));
            produto.setTipoproduto(new TipoProdutoDAO().buscarPorId(resultadoConsulta.getInt("tipoproduto_id")));
            produto.setUnidade(Unidade.valueOf(resultadoConsulta.getInt("unidade")));
            
            retorno.add(produto);
        }

        return retorno;
    }
    
    public ArrayList<Produto> pesquisaPorTexto(String filtro) throws SQLException {
        ArrayList<Produto> retorno = new ArrayList<>();
        ResultSet resultadoConsulta = executarConsultaSQL(
                "select * from produto where lower(nome) ilike ?",
            "%" + filtro.trim().toLowerCase()+ "%");
        while (resultadoConsulta.next()) {
            Produto produto = new Produto();
            produto.setId(resultadoConsulta.getInt("id"));
            produto.setNome(resultadoConsulta.getString("nome"));
            produto.setDescricao(resultadoConsulta.getString("descricao"));
            produto.setPreco_unitario(resultadoConsulta.getDouble("preco_unitario"));
            produto.setRegistro_ativo(resultadoConsulta.getBoolean("registro_ativo"));
            produto.setTipoproduto(new TipoProdutoDAO().buscarPorId(resultadoConsulta.getInt("tipoproduto_id")));
            produto.setUnidade(Unidade.valueOf(resultadoConsulta.getInt("unidade")));
            
            retorno.add(produto);
        }

        return retorno;
    }
 
}
