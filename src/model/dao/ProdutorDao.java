/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.bd.DB;
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
		// Se nao afetou nenhuma linha:
		System.out.println("Nao afetou nenhuma linha!");
	    }
	}
	catch (SQLException e)
	{
	    System.out.println("Erro ao inserir objeto!\nErro:" + e.getMessage());
	}
	finally
	{
	    DB.closeStatement(st);
	}

    }

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
		// Se nao afetou nenhuma linha:
		System.out.println("Nada foi alterado!");
	    }

	}
	catch (SQLException e)
	{
	    System.out.println("Erro ao alterar objeto!\nErro:" + e.getMessage());
	}
	finally
	{
	    DB.closeStatement(st);
	}
    }

    public void deleteById(int id)
    {

    }

    public List<Produtor> findAll()
    {
	return null;
    }

}
