package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entidades.TipoProduto;

public class TipoProdutoDAO extends DAO<TipoProduto>  {

    @Override
    public void inserir(TipoProduto tipoProduto) throws SQLException {
        executarConsultaDML("insert into tipotipoProduto(nome, registro_ativo)"
                + " values (?, ?)",
                tipoProduto.getNome(), tipoProduto.isRegistro_ativo());
    }

    @Override
    public void excluir(TipoProduto tipoProduto) throws SQLException {
        executarConsultaDML("delete from tipoProduto where id = ?", tipoProduto.getId());
    }

    @Override
    public void alterar(TipoProduto tipoProduto) throws SQLException {
        executarConsultaDML("update tipoProduto set nome = ?, registro_ativo = ? where id = ?",
                tipoProduto.getNome(), tipoProduto.isRegistro_ativo());
    }

    @Override
    public ArrayList<TipoProduto> pesquisar(String filtro) throws SQLException {
        ArrayList<TipoProduto> retorno = new ArrayList<>();
        
        String sql = "select * from tipoProduto";
        
        if (filtro != null){
            sql = sql+" where lower(nome) like ? ";
        }
        
        ResultSet resultadoConsulta = null;
        
        if (filtro != null){
            resultadoConsulta = executarConsultaSQL(sql, filtro.trim().toLowerCase());
        }else{
            resultadoConsulta = executarConsultaSQL(sql);
        }
        
        while (resultadoConsulta.next()) {
            TipoProduto tipoProduto = new TipoProduto();
            tipoProduto.setId(resultadoConsulta.getInt("id"));
            tipoProduto.setNome(resultadoConsulta.getString("nome"));
            tipoProduto.setRegistro_ativo(resultadoConsulta.getBoolean("registro_ativo"));
            
            retorno.add(tipoProduto);
        }

        return retorno;
    }
    
    @Override
    public ArrayList<TipoProduto> listar() throws SQLException {
        return pesquisar(null);
    }
    
    public TipoProduto buscarPorId(Integer id) throws SQLException {
        
        String sql = "select * from tipoProduto where id = ?";
        ResultSet resultadoConsulta = executarConsultaSQL(sql,id);
        
        while (resultadoConsulta.next()) {
            TipoProduto tipoProduto = new TipoProduto();
            tipoProduto.setId(resultadoConsulta.getInt("id"));
            tipoProduto.setNome(resultadoConsulta.getString("nome"));
            tipoProduto.setRegistro_ativo(resultadoConsulta.getBoolean("registro_ativo"));
            
            return tipoProduto;
        }

        return null;
    }
    
}
