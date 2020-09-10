/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.testes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bd.DB;
import model.dao.EstadoDAO;
import model.dao.ProdutorDao;
import model.entidades.Estado;
import model.entidades.Produtor;

/**
 *
 * @author Andre
 */
public class TesteDB {

    public static void main(String[] args) {
        EstadoDAO estadoDAO = new EstadoDAO();
        ArrayList<Estado> estados;

        try {
            Estado novoEstado = new Estado(28, "EstadoBoso", "Eb");
            estados = estadoDAO.listar();
            System.out.println(estados.size());

            estadoDAO.excluir(novoEstado);
            estados = estadoDAO.listar();
            System.out.println(estados.size());

            estadoDAO.inserir(novoEstado);
            estados = estadoDAO.listar();
            System.out.println(estados.size());

                
            estados = estadoDAO.listar();
            for (Estado estado : estados) {

                System.out.println(estado);
            }
            
            novoEstado.setNome("RONALDINHO");
            estadoDAO.alterar(novoEstado);
            
            estados = estadoDAO.pesquisar("28");
            System.out.println(" ---------------  ");
            for (Estado estado : estados) {

                System.out.println(estado);
            }
            
            
            

            /*
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
             */        } catch (SQLException ex) {
            Logger.getLogger(TesteDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
