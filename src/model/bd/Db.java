package model.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maycon
 */
public class Db
{

    private static Connection conexao = null;

    public static Connection getConection() 
    {
	if (conexao == null)
	{
	    try
	    {
		conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProjetoOrganicos", "postgres", "postgres");
	    }
	    catch (SQLException e)
	    {
		System.out.println("Erro ao definir a conexao!\nErro:" + e.getMessage());
	    }
	}
	return conexao;

    }

    public static void closeConnection()
    {
	if (conexao != null)
	{
	    try
	    {
		conexao.close();
	    }
	    catch (SQLException e)
	    {
		System.out.println("Erro ao fechar a conexao!\nErro:" + e.getMessage());
	    }
	}
    }

    public static void closeStatement(Statement st)
    {
	if (st != null)
	{
	    try
	    {
		st.close();
	    }
	    catch (SQLException e)
	    {
		System.out.println("Erro liberar o statement!\nErro:" + e.getMessage());
	    }
	}
    }

    public static void closeResultSet(ResultSet rs)
    {
	if (rs != null)
	{
	    try
	    {
		rs.close();
	    }
	    catch (SQLException e)
	    {
		System.out.println("Erro liberar o ResultSet!\nErro:" + e.getMessage());
	    }
	}
    }

}