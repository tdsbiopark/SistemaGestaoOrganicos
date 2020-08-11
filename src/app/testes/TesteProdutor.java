/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.testes;

import model.entidades.Certificadora;
import model.entidades.Cidade;
import model.entidades.Estado;
import model.entidades.Grupo;
import model.entidades.Produto;
import model.entidades.Produtor;
import model.entidades.ProdutorProduto;
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
	//*****************************************************************************************************
	//CADASTRO DE CERTIFICADORA:
	//*****************************************************************************************************
	Certificadora certificadora1 = new Certificadora(1, "OrganicsNet", true);
	Certificadora certificadora2 = new Certificadora(1, "Ecocert Brasil", true);

	//*****************************************************************************************************
	//CADASTRO DE CIDADE:
	//*****************************************************************************************************
	Cidade cidade1 = new Cidade(1, "Toledo", new Estado(1, "Parana", "PR"));
	Cidade cidade2 = new Cidade(2, "Curitiba", new Estado(1, "Parana", "PR"));
	Cidade cidade3 = new Cidade(3, "Marau", new Estado(1, "Rio Grande Do Sul", "RS"));

	//*****************************************************************************************************
	//CADASTRO DE ESTADO-UF
	//*****************************************************************************************************
	Estado uf1 = new Estado(1, "Parana", "PR");
	uf1.getCidades().add(cidade1);
	uf1.getCidades().add(cidade2);

	Estado uf2 = new Estado(1, "Rio Grande Do Sul", "RS");
	uf2.getCidades().add(cidade3);

	//*****************************************************************************************************
	//CADASTRO DE GRUPO:
	//*****************************************************************************************************	
	Grupo grupo1 = new Grupo(1, "CooperTol", "Não informado", 12345, "morada do sol", "39.827.679/0001-22", "12345-45", true, true, cidade2);

	//*****************************************************************************************************
	//CADASTRO DE TIPOS DE PRODUTO:
	//*****************************************************************************************************
	TipoProduto tipoProduto1 = new TipoProduto(1, "Orgânico", true);
	TipoProduto tipoProduto2 = new TipoProduto(2, "Agroecológico", true);

	//*****************************************************************************************************
	//CADASTRO DE PRODUTO:
	//*****************************************************************************************************
	Produto produto1 = new Produto(1, "Alface Crespa", "Alface Crespa", 2.85, Unidade.UN, true, tipoProduto1);
	Produto produto2 = new Produto(2, "Alface Americana", "Alface Americana", 3.55, Unidade.UN, true, tipoProduto1);
	Produto produto3 = new Produto(3, "Mandioca BR", "Mandioca tipo Branca", 5.81, Unidade.Kg, true, tipoProduto2);
	Produto produto4 = new Produto(4, "Milho", "Milho 6 Espiga bandeja", 7.55, Unidade.BANDEJA, true, tipoProduto2);

	System.out.println("-----------------------------");
	System.out.println(produto1.toString());
	System.out.println(produto2.toString());
	System.out.println(produto3.toString());
	System.out.println(produto4.toString());

	//*****************************************************************************************************
	//CADASTRO DE PRODUTOR:
	//*****************************************************************************************************
	Produtor produtor1 = new Produtor();
	produtor1.setId(1);
	produtor1.setNome("Seu Almir");
	produtor1.setNome_propriedade("Sitio Bela Vista");
	produtor1.setCpf_cnpj("78.977.850/0001-31");
	produtor1.setNumero(478);
	produtor1.setTelefone("99-999999-9999");
	produtor1.setEndereco("");
	produtor1.setBairro("");
	produtor1.setLatitude(1321354.45);
	produtor1.setLongitude(45787.0);
	produtor1.setCertificacao_organicos("S");
	produtor1.setVenda_consumidorfinal(true);
	produtor1.setRegistro_ativo(true);
	produtor1.setCertificadora(certificadora2);
	produtor1.setGrupo(grupo1);
	produtor1.setCidade(cidade1);
	

	Produtor produtor2 = new Produtor();
	produtor2.setId(2);
	produtor2.setNome("Seu Atur");
	produtor2.setNome_propriedade("Fazenda Cerro Azul");
	produtor2.setCpf_cnpj("11.692.748/0001-19");
	produtor2.setNumero(478);
	produtor2.setTelefone("99-999999-9999");
	produtor2.setEndereco("");
	produtor2.setBairro("");
	produtor2.setLatitude(1321354.45);
	produtor2.setLongitude(45787.0);
	produtor2.setCertificacao_organicos("S");
	produtor2.setVenda_consumidorfinal(true);
	produtor2.setRegistro_ativo(false);
	produtor2.setCertificadora(certificadora1);
	produtor2.setGrupo(grupo1);
	produtor2.setCidade(cidade2);

	System.out.println("-----------------------------");
	System.out.println(produtor1.toString());
	
	System.out.println("-----------------------------");
	System.out.println(produtor2.toString());
	
	
	

	//*****************************************************************************************************
	//CADASTRO DE PRODUTOR-PRODUTO:
	//*****************************************************************************************************
	ProdutorProduto prodProd = new ProdutorProduto();
	
	
	
	//*****************************************************************************************************
	//CADASTRO DE PONTOS DE VENDA:
	//*****************************************************************************************************
	
	
	
	
	
	
    }
}
