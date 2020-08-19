/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Andre
 */
public class PontosVenda implements Serializable
{

    private int id;
    private String nome;
    private String endereco;
    private int numero;
    private String bairro;
    private boolean registro_ativo;

    private Cidade cidade;   
    
    private ArrayList<ProdutorProduto> produtorProduto = new ArrayList<ProdutorProduto>();

    public PontosVenda()
    {
    }

    public PontosVenda(int id, String nome, String endereco, int numero, String bairro, boolean registro_ativo, Cidade cidade)
    {
	this.id = id;
	this.nome = nome;
	this.endereco = endereco;
	this.numero = numero;
	this.bairro = bairro;
	this.registro_ativo = registro_ativo;
	this.cidade = cidade;
    }

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public String getNome()
    {
	return nome;
    }

    public void setNome(String nome)
    {
	this.nome = nome;
    }

    public String getEndereco()
    {
	return endereco;
    }

    public void setEndereco(String endereco)
    {
	this.endereco = endereco;
    }

    public int getNumero()
    {
	return numero;
    }

    public void setNumero(int numero)
    {
	this.numero = numero;
    }

    public String getBairro()
    {
	return bairro;
    }

    public void setBairro(String bairro)
    {
	this.bairro = bairro;
    }

    public boolean isRegistro_ativo()
    {
	return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo)
    {
	this.registro_ativo = registro_ativo;
    }

    public Cidade getCidade()
    {
	return cidade;
    }

    public void setCidade(Cidade cidade)
    {
	this.cidade = cidade;
    }

    public ArrayList<ProdutorProduto> getProdutorProduto()
    {
	return produtorProduto;
    }

    public void setProdutorProduto(ArrayList<ProdutorProduto> produtorProduto)
    {
	this.produtorProduto = produtorProduto;
    }

    @Override
    public int hashCode()
    {
	int hash = 5;
	hash = 31 * hash + Objects.hashCode(this.nome);
	return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
	if (this == obj)
	{
	    return true;
	}
	if (obj == null)
	{
	    return false;
	}
	if (getClass() != obj.getClass())
	{
	    return false;
	}
	final PontosVenda other = (PontosVenda) obj;
	if (!Objects.equals(this.nome, other.nome))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "PontosVenda{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ", registro_ativo=" + registro_ativo + ", cidade=" + cidade + ", produtorProduto=" + produtorProduto + '}';
    }
    
    
    
    
}
