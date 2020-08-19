/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.testes;

import model.bd.DB;
import model.dao.ProdutorDao;
import model.entidades.Produtor;

/**
 *
 * @author Andre
 */
public class TesteDB
{

    public static void main(String[] args)
    {
	try
	{
	    //Cria o produtor:
	    Produtor produtor = new Produtor();

	    //ao instancia o DAO  ja defini a conexao
	    ProdutorDao produtorDao = new ProdutorDao(DB.getConection());
	    //faz um insert:
	    produtorDao.insert(produtor);

	    System.out.println("Teste de banco realizado com sucesso!!");
	}
	catch (Exception e)
	{
	    System.out.println("Erro ao testar \nErro:");
	    e.printStackTrace();
	}

    }
}
