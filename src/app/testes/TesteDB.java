/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.testes;

import java.sql.Connection;
import model.bd.DB;

/**
 *
 * @author Andre
 */
public class TesteDB
{
    public static void main(String[] args)
    {
	Connection conexao;
	
	DB db = new DB();
	
	conexao = db.getConection();
	
	
    }
}
