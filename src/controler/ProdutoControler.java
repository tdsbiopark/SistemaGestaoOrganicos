/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.ProdutoDAO;
import model.dao.TipoProdutoDAO;
import model.entidades.Produto;
import model.entidades.TipoProduto;

/**
 *
 * @author jonasidney
 */
public class ProdutoControler {
    private TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    
    private ArrayList<Produto> listaProduto = new ArrayList<>();
    private ArrayList<TipoProduto> listaTipoProduto = new ArrayList<>();

   
    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(ArrayList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public ArrayList<TipoProduto> getListaTipoProduto() {
        
        try {
            return tipoProdutoDAO.listar();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }

    public void setListaTipoProduto(ArrayList<TipoProduto> listaTipoProduto) {
        this.listaTipoProduto = listaTipoProduto;
    }
    
    public void gravar(Produto produto){
        try {
            produtoDAO.inserir(produto);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
