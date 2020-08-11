/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.testes;

import model.entidades.Produto;
import model.entidades.TipoProduto;
import model.entidades.enums.Unidade;

/**
 *
 * @author Andre
 */
public class TesteProdutor
{

    public static void main(String[] args)
    {
	
	//CADASTRO DE TIPOS DE PRODUTO:
	TipoProduto  tipoProduto1 = new TipoProduto(1, "Orgânico", true);
	TipoProduto  tipoProduto2 = new TipoProduto(2, "Agroecológico", true);
	
	
	//CADASTRO DE PRODUTO:
	Produto produto1 = new Produto(1, "Alface Crespa", "Alface Crespa", 2.85, Unidade.UN, true, tipoProduto1);
	Produto produto2 = new Produto(2, "Alface Americana", "Alface Americana", 3.55, Unidade.UN, true, tipoProduto1);
	
	
	System.out.println(produto1.toString());
	
	
	//CADASTRO DE PRODUTOR:
	
	//CADASTRO DE PRODUTOR-PRODUTO:
	
	//CADASTRO DE CERTIFICADORA:
	
	//CADASTRO DE GRUPO:
	
	//CADASTRO DE CIDADE:


    }
}
