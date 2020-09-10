/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entidades.Cidade;

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class CidadeDAO extends DAO<Cidade> {

    @Override
    public void inserir(Cidade objeto) throws SQLException {
       
    }

    @Override
    public void excluir(Cidade objeto) throws SQLException {
         
    }

    @Override
    public void alterar(Cidade objeto) throws SQLException {
       
    }

    
    @Override
    public ArrayList<Cidade> pesquisar(String filtro) throws SQLException {
       return null; 
    }

    @Override
    public ArrayList<Cidade> listar() throws SQLException {
        return null;
        
    }
    
    
}
