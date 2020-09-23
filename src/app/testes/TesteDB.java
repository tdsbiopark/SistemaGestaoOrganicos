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
import model.dao.UsuarioDAO;
import model.entidades.Estado;
import model.entidades.Produtor;
import model.entidades.Usuario;

/**
 *
 * @author Andre
 */
public class TesteDB {

    public static void main(String[] args) {
    
    /*Testando a Classe UsuarioDAO*/
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       ArrayList<Usuario>usuarios;
       
       
        try {
            Usuario usuario1 = new Usuario("Administrador", "admin", "123456",true);
            Usuario usuario2 = new Usuario("Alan Junior dos Santos", "alan", "123456",true);
            Usuario usuario3 = new Usuario("Camila Toledo Ortega", "camila", "123456",false);
            Usuario usuario4 = new Usuario("Dorival Farias dos Santos", "dorival", "123456",true);
          
                                           
                        
            /* ---------- Excluir usuario ---------  */         
            usuarioDAO.excluir(usuario4);
            usuarios = usuarioDAO.listar();
            System.out.println(usuarios.size());
            
            /* ---------- inserir usuario --------- 
            usuarioDAO.inserir(usuario4);
            usuarios = usuarioDAO.listar();
            System.out.println(usuarios.size());*/
            
            /* ---------- Editar Usuario --------- 
            usuario1.setSenha("admin");
            usuarioDAO.alterar(usuario4);*/
            
            /* ---------- Listar todos usarios --------- 
            usuarios = usuarioDAO.listar();
            for (Usuario usuario : usuarios) {
            
            System.out.println(usuario);
            }*/
           
            
            /* ---------- Listar usuario por ID --------- 
            
            usuarios = usuarioDAO.pesquisar("1");
            System.out.println(" ---------------  ");
            for (Usuario usuario : usuarios) {
            
            System.out.println(usuario);
            }
            */ 
 
            
            /*
            
            
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
            
            
            */

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
            
        } catch (SQLException ex) {
            Logger.getLogger(TesteDB.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            
        } catch (SQLException ex) {
            Logger.getLogger(TesteDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
