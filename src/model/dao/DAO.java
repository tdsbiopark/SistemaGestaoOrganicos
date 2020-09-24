/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bd.DB;


/**
 *
 * @author Rafael
 * @param <T>
 */
public abstract class DAO<T> {
    
   public abstract void inserir(T objeto) throws SQLException;
   public abstract void excluir(T objeto) throws SQLException;
   public abstract void alterar(T objeto) throws SQLException;
   public abstract ArrayList<T> pesquisar(String filtro) throws SQLException;
   public abstract ArrayList<T> listar() throws SQLException;

    private PreparedStatement criarConsultaSQL(String SQL,
            Object... parametros) throws SQLException {
        PreparedStatement stmt = DB.getConection().prepareStatement(SQL);
        if (parametros != null) {
            for (int i = 0; i < parametros.length; i++) {
                stmt.setObject(i + 1, parametros[i]);
            }
        }
        return stmt;
    }

    protected void executarConsultaDML(String SQL,
            Object... parametros) throws SQLException {
        criarConsultaSQL(SQL, parametros).executeUpdate();
    }
    
     protected ResultSet executarConsultaSQL(String SQL,
            Object... parametros) throws SQLException {
        return criarConsultaSQL(SQL, parametros).executeQuery();
    }
}
