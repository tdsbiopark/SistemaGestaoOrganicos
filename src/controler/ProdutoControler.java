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
    
    public void gravar(Produto produto) throws Exception{
        validar(produto);
        try {
            if (produto.getId() == null ){
                produtoDAO.inserir(produto);
            } else {
                produtoDAO.alterar(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoControler.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Ocorreu um erro inesperado ao tentar gravar o produto! Erro: "+ex.getMessage());
        }
    }
    
    public void excluir(Produto produto) throws Exception{
        try {
            produtoDAO.excluir(produto);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoControler.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Ocorreu um erro inesperado ao tentar Excluir o produto! Erro: "+ex.getMessage());
        }
    }
    
    public void validar(Produto produto) throws Exception{
        if (produto.getNome() == null || produto.getNome().trim().isEmpty()){ 
            throw new Exception("O nome do produto não pode ser nulo!");
        }
        if (produto.getPreco_unitario() == null || produto.getPreco_unitario() <= 0){ 
            throw new Exception("O preço do produto deve ser maior que Zero!");
        }
        if (produto.getUnidade() == null){ 
            throw new Exception("A unidade do produto não pode ser nula!");
        }
        if (produto.getTipoproduto() == null){ 
            throw new Exception("O tipo do produto não pode ser nulo!");
        }
        ArrayList<Produto> produtosCadastrados = produtoDAO.pesquisar(produto.getNome());
        if (produtosCadastrados != null && !produtosCadastrados.isEmpty()){
            throw  new Exception("Produto já cadastrado com este nome!");
        }
    }
    
    public ArrayList<Produto> pesquisaPorTexto(String filtro) {
        try {
            return produtoDAO.pesquisaPorTexto(filtro);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
    
    public Produto pesquisaPorId(Integer id){
        try {
            return produtoDAO.pesquisaPorId(id);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
