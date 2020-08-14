package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.bd.Db;
import model.entidades.Certificadora;

/**
 *
 * @author maycon
 */
public class CertificadoraDao {

    private static Connection conexao = null;

    //Instancia com uma conexão ja pré-definida
    public CertificadoraDao(Connection conexao) {
        this.conexao = conexao;
    }

    /**
     * Faz inserte de um novo registro
     *
     * @param obj
     */
    public void insert(Certificadora obj) {
        PreparedStatement st = null;
        try {
            st = conexao.prepareStatement(
                    "INSERT INTO Certificadora "
                    + "(id,nome,registro_ativo) "
                    + "VALUES "
                    + "(?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);// Retorna o Id Gerado

            // Pega os dados do obj de entrada e passa para o SQL
            st.setInt(1, obj.getId());
            st.setString(2, obj.getNome());
            st.setBoolean(3, obj.isRegistro_ativo());

            // Pega o numero de linhas afetadas:
            int rowsAffected = st.executeUpdate();

            // Se for afetado mais de uma linha
            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    // Peg o ID gerado:
                    int id = rs.getInt(1);
                    //set o id no obj		    
                    obj.setId(id);
                }
                // Libera memoria:
                Db.closeResultSet(rs);
            } else {
                // Se nao afetou nenhuma linha, lança exceção:
                //throw new DbException("Erro inesperado! Nenhuma registro alterado!");
            }
        } catch (SQLException e) {
            // Se der erro de SQL, lança SQLException:
            //throw new DbException("Erro ao inserir novo registro!\n" + e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    }

    /**
     * Faz alterações em um registro
     *
     * @param obj
     */
    public void update(Certificadora obj) {
        PreparedStatement st = null;

        try {
            st = conexao.prepareStatement(
                    "INSERT INTO Certificadora " + "(id,nome,registro_ativo) " + "VALUES " + "(?,?,?))",
                    Statement.RETURN_GENERATED_KEYS);// Retorna o Id Gerado

            // Pega os dados do obj de entrada e passa para o SQL
            st.setInt(1, obj.getId());
            st.setString(2, obj.getNome());
            st.setBoolean(3, obj.isRegistro_ativo());

            // Pega o numero de linhas afetadas:
            int rowsAffected = st.executeUpdate();

            // Se for afetado mais de uma linha
            if (rowsAffected > 0) {
                System.out.println("Alteração realizado com sucesso!");
            } else {
                // Se nao afetou nenhuma linha, lança exceção:
                //throw new DbException("Erro inesperado! Nenhuma registro alterado!");
            }

        } catch (SQLException e) {
            // Se der erro de SQL, lança SQLException:
            //throw new DbException("Erro ao atualizar o registro!\n" + e.getMessage());
        } finally {
            Db.closeStatement(st);
        }
    }
    
    public void deleteById(Integer id)
    {
	PreparedStatement st = null;
	try
	{
	    st = conexao.prepareStatement("DELETE FROM certificadora WHERE Id = ?");

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
	    //throw new DbException("Erro ao deletar o registro!\n" + e.getMessage());
	}
	finally
	{
	    Db.closeStatement(st);
	}
    }
    
    public List<Certificadora> findAll(Integer id)
    {
	return null;
    }
    
    public Certificadora findById(Integer id)
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

//		// Tranforma os dados da tabela em lista de objetos
//		Certificadora cert = instanciaCertificadora(rs);
//		Grupo grup = instanciaGrupo(rs);
//		Cidade cid = instanciaCidade(rs);

		// Certificadora:
//		Certificadora obj = instanciaCertificadora(rs, cert, grup, cid);

		//return obj;

	    }

	    // se nao vem resultado retorna null
	    return null;

	}
	catch (SQLException e)// Captura e exceção de SQL
	{

	    //throw new DbException(e.getMessage());

	}
	finally
	{

	    Db.closeStatement(st);
	    Db.closeResultSet(rs);

	}
        return null;
    }

}
