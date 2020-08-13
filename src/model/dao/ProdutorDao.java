/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.bd.DB;
import model.entidades.Certificadora;
import model.entidades.Cidade;
import model.entidades.Grupo;
import model.entidades.Produtor;

/**
 *
 * @author Andre
 */
public class ProdutorDao
{

    private static Connection conexao = null;

    //ja instancia com uma conexão definida
    public ProdutorDao(Connection conexao)
    {
	this.conexao = conexao;
    }

    /**
     * Faz inserte de um novo registro
     *
     * @param obj
     */
    public void insert(Produtor obj)
    {
	PreparedStatement st = null;
	try
	{
	    st = conexao.prepareStatement(
		    "INSERT INTO produtor "
		    + "(certificadora_id,grupo_id,cidade_id,nome,nome_propriedade,cpf_cnpj,"
		    + "numero,telefone,endereco,bairro,latitude,longitude,certificacao_organicos,"
		    + "venda_consumidorfinal,registro_ativo) "
		    + "VALUES "
		    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
		    Statement.RETURN_GENERATED_KEYS);// Retorna o Id Gerado

	    // Pega os dados do obj de entrada e passa para o SQL
	    st.setInt(1, obj.getCertificadora().getId());
	    st.setInt(2, obj.getGrupo().getId());
	    st.setInt(3, obj.getCidade().getId());
	    st.setString(4, obj.getNome());
	    st.setString(5, obj.getNome_propriedade());
	    st.setString(6, obj.getCpf_cnpj());
	    st.setInt(7, obj.getNumero());
	    st.setString(8, obj.getTelefone());
	    st.setString(9, obj.getEndereco());
	    st.setString(10, obj.getBairro());
	    st.setDouble(11, obj.getLatitude());
	    st.setDouble(12, obj.getLongitude());
	    st.setString(13, obj.getCertificacao_organicos());
	    st.setBoolean(14, obj.isVenda_consumidorfinal());
	    st.setBoolean(15, obj.isRegistro_ativo());

	    // Pega o numero de linhas afetadas:
	    int rowsAffected = st.executeUpdate();

	    // Se for afetado mais de uma linha
	    if (rowsAffected > 0)
	    {
		ResultSet rs = st.getGeneratedKeys();
		if (rs.next())
		{
		    // Peg o ID gerado:
		    int id = rs.getInt(1);
		    //set o id no obj		    
		    obj.setId(id);
		}
		// Libera memoria:
		DB.closeResultSet(rs);
	    }
	    else
	    {
		// Se nao afetou nenhuma linha, lança exceção:
		throw new DbException("Erro inesperado! Nenhuma registro alterado!");
	    }
	}
	catch (SQLException e)
	{
	    // Se der erro de SQL, lança SQLException:
	    throw new DbException("Erro ao inserir novo registro!\n" + e.getMessage());
	}
	finally
	{
	    DB.closeStatement(st);
	}

    }

    /**
     * Faz alterações em um registro
     *
     * @param obj
     */
    public void update(Produtor obj)
    {
	PreparedStatement st = null;

	try
	{
	    st = conexao.prepareStatement(
		    "INSERT INTO produtor "
		    + "(certificadora_id,grupo_id,cidade_id,nome,nome_propriedade,cpf_cnpj,"
		    + "numero,telefone,endereco,bairro,latitude,longitude,certificacao_organicos,"
		    + "venda_consumidorfinal,registro_ativo) "
		    + "VALUES "
		    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
		    Statement.RETURN_GENERATED_KEYS);// Retorna o Id Gerado

	    // Pega os dados do obj de entrada e passa para o SQL
	    st.setInt(1, obj.getCertificadora().getId());
	    st.setInt(2, obj.getGrupo().getId());
	    st.setInt(3, obj.getCidade().getId());
	    st.setString(4, obj.getNome());
	    st.setString(5, obj.getNome_propriedade());
	    st.setString(6, obj.getCpf_cnpj());
	    st.setInt(7, obj.getNumero());
	    st.setString(8, obj.getTelefone());
	    st.setString(9, obj.getEndereco());
	    st.setString(10, obj.getBairro());
	    st.setDouble(11, obj.getLatitude());
	    st.setDouble(12, obj.getLongitude());
	    st.setString(13, obj.getCertificacao_organicos());
	    st.setBoolean(14, obj.isVenda_consumidorfinal());
	    st.setBoolean(15, obj.isRegistro_ativo());

	    // Pega o numero de linhas afetadas:
	    int rowsAffected = st.executeUpdate();

	    // Se for afetado mais de uma linha
	    if (rowsAffected > 0)
	    {
		System.out.println("Alteração realizado com sucesso!");
	    }
	    else
	    {
		// Se nao afetou nenhuma linha, lança exceção:
		throw new DbException("Erro inesperado! Nenhuma registro alterado!");
	    }

	}
	catch (SQLException e)
	{
	    // Se der erro de SQL, lança SQLException:
	    throw new DbException("Erro ao atualizar o registro!\n" + e.getMessage());
	}
	finally
	{
	    DB.closeStatement(st);
	}
    }

    public void deleteById(Integer id)
    {
	PreparedStatement st = null;
	try
	{
	    st = conexao.prepareStatement("DELETE FROM produtor WHERE Id = ?");

	    st.setInt(1, id);

	    // Pega o numero de linhas afetadas:
	    int rowsAffected = st.executeUpdate();

	    // Se não for afetado nenhuma linha significa que o Id nao existe
	    if (rowsAffected == 0)
	    {
		// Se nao afetou nenhuma linha, lança exceção:
		throw new SQLException("Id informado nao encontrado!  nada foi alterado!");
	    }

	}
	catch (SQLException e)
	{
	    // Se der erro de SQL, lança SQLException:
	    throw new DbException("Erro ao deletar o registro!\n" + e.getMessage());
	}
	finally
	{
	    DB.closeStatement(st);
	}
    }

    public List<Produtor> findAll(Integer id)
    {
	return null;
    }

    //PAREI AQUI!!
    public Produtor findById(Integer id)
    {

	PreparedStatement st = null;
	ResultSet rs = null;

	try
	{

	    // Inicia o prepareStatement:
	    st = conexao.prepareStatement("SELECT prod.*, ce.*, cd.*, gr.* "
		    + "FROM produtor as prod "
		    + "INNER JOIN certificadora AS ce "
		    + "INNER JOIN grupo as gr "
		    + "INNER JOIN cidade as cd "
		    + "ON "
		    + "prod.certificadora_id = ce.id "
		    + "AND"
		    + " prod.grupo_id = gr.id "
		    + "AND"
		    + " prod.cidade_id = cd.id "
		    + "WHERE prod.id = ?");

	    // Passa o id para consulta
	    st.setInt(1, id);

	    // Recebe o resultado:
	    rs = st.executeQuery();

	    // testa se retornou algum resultado:
	    if (rs.next())
	    {

		// Tranforma os dados da tabela em lista de objetos
		Certificadora cert = instanciaCertificadora(rs);
		Grupo grup = instanciaGrupo(rs);
		Cidade cid = instanciaCidade(rs);

		// PRODUTOR:
		Produtor obj = instanciaProdutor(rs, cert, grup, cid);

		return obj;

	    }

	    // se nao vem resultado retorna null
	    return null;

	}
	catch (SQLException e)// Captura e exceção de SQL
	{

	    throw new DbException(e.getMessage());

	}
	finally
	{

	    DB.closeStatement(st);
	    DB.closeResultSet(rs);

	}
    }

    //===============================================================================
    // METODOS AUXILIARES PARA INSTANCIAR OBJETOS
    //===============================================================================
    
    /**
     * Passar os dados do resultset para o objeto, propaga a exceção caso der
     * erro
     *
     */
    private Produtor instanciaProdutor(ResultSet rs, Certificadora cert, Grupo grupo, Cidade cidade) throws SQLException
    {
	// PRODUTOR
	Produtor obj = new Produtor();
	obj.setCertificadora(cert);
	obj.setGrupo(grupo);
	obj.setCidade(cidade);
	// Nome das colunas da consulta:
	obj.setId(rs.getInt("id"));
	obj.setNome(rs.getString("nome"));
	obj.setNome_propriedade(rs.getString("nome_propriedade"));
	obj.setCpf_cnpj(rs.getString("cpf_cnpj"));
	obj.setNumero(rs.getInt("numero"));
	obj.setTelefone(rs.getString("telefone"));
	obj.setEndereco(rs.getString("endereco"));
	obj.setBairro(rs.getString("bairro"));
	obj.setLatitude(rs.getDouble("latitude"));
	obj.setLongitude(rs.getDouble("longitude"));
	obj.setCertificacao_organicos(rs.getString("certificacao_organicos"));
	obj.setVenda_consumidorfinal(rs.getBoolean("venda_consumidorfinal"));
	obj.setRegistro_ativo(rs.getBoolean("registro_ativo"));
	return obj;

    }

    private Certificadora instanciaCertificadora(ResultSet rs)
    {
	Certificadora obj = new Certificadora();

	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Grupo instanciaGrupo(ResultSet rs)
    {
	Grupo obj = new Grupo();

	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Cidade instanciaCidade(ResultSet rs)
    {
	Cidade obj = new Cidade();

	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
