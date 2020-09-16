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
import java.util.ArrayList;
import model.bd.DB;

/**
 *
 * @author Rafael
 * @param <T>
 */
public abstract class DAO<T>
{
    private Connection conexao;

    public static Integer rowsAffected = null;

    public abstract void inserir(T objeto) throws SQLException;

    public abstract void excluir(T objeto) throws SQLException;

    public abstract void alterar(T objeto) throws SQLException;

    public abstract ArrayList<T> pesquisar(String filtro) throws SQLException;

    public abstract ArrayList<T> listar() throws SQLException;

    public DAO()
    {
	this.conexao = DB.getConection();
    }

    private PreparedStatement criarConsultaSQL(String sql, Object... parametros) throws SQLException
    {
	PreparedStatement stmt = null;
	stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	if (parametros != null)
	{
	    for (int i = 0; i < parametros.length; i++)
	    {
		stmt.setObject(i + 1, parametros[i]);
	    }
	}
	return stmt;
    }

    /**
     *
     * @param sql
     * @param parametros
     * @return
     * @throws SQLException
     */
    protected Integer executarConsultaDML(String sql, Object... parametros) throws SQLException
    {
	PreparedStatement st = criarConsultaSQL(sql, parametros);
	int id = 0;
	rowsAffected = st.executeUpdate();
	if (rowsAffected > 0)
	{
	    ResultSet rs = st.getGeneratedKeys();
	    if (rs.next())
	    {
		id = rs.getInt(1);
	    }
	    DB.closeResultSet(rs);
	}
	return id;
    }

    protected ResultSet executarConsultaSQL(String SQL,Object... parametros) throws SQLException
    {
	return criarConsultaSQL(SQL, parametros).executeQuery();
    }

}
