/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entidades.Estado;

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class EstadoDAO extends DAO<Estado>{

    @Override
    public void inserir(Estado objeto) throws SQLException {
        
        executarConsultaDML( "INSERT INTO estado (id, nome, sigla) VALUES (?, ?, ?) " ,objeto.getId(),objeto.getNome(),objeto.getSigla());
    }

    @Override
    public void excluir(Estado objeto) throws SQLException {
        executarConsultaDML("DELETE FROM estado WHERE id = ? ", objeto.getId());
    }

    @Override
    public void alterar(Estado objeto) throws SQLException {
        executarConsultaDML("UPDATE estado SET nome = ?, sigla = ? where id = ? ", objeto.getNome(), objeto.getSigla(),objeto.getId());
    }

    @Override
    public ArrayList<Estado> pesquisar(String filtro) throws SQLException {
         
        ResultSet rs = null;
        ArrayList <Estado> estados = new ArrayList<>();
        String sql = " SELECT id, nome, sigla FROM estado";
        if (filtro != null){
            sql = sql + " where id = ?";
        }
        
        rs = executarConsultaSQL(sql, Integer.parseInt(filtro));
        
        
        
        while (rs.next() ){
            Estado e = new Estado();
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setSigla(rs.getString("sigla"));
            
            estados.add(e);
        }
        
        return estados;
        
    }

    @Override
    public ArrayList<Estado> listar() throws SQLException {
        
        ResultSet rs = null;
        ArrayList <Estado> estados = new ArrayList<>();
        rs = executarConsultaSQL(" SELECT id, nome, sigla FROM estado", null);
        
        while (rs.next() ){
            Estado e = new Estado();
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setSigla(rs.getString("sigla"));
            
            estados.add(e);
        }
        
        return estados;
    }

}
