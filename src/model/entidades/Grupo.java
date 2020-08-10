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
public class Grupo implements Serializable
{

    private int id;
    private String nome;
    private String endereco;
    private int numero;
    private String bairro;    
    private String cnpj;
    private String inscricao_estadual;
    private boolean distribuidor_produtos;
    private boolean registro_ativo;
    
    private Cidade cidade;
    
    private ArrayList<Produtor> produtor = new ArrayList<Produtor>();

    public Grupo()
    {
    }

    public Grupo(int id, String nome, String endereco, int numero, String bairro, String cnpj, String inscricao_estadual, boolean distribuidor_produtos, boolean registro_ativo, Cidade cidade)
    {
	this.id = id;
	this.nome = nome;
	this.endereco = endereco;
	this.numero = numero;
	this.bairro = bairro;
	this.cnpj = cnpj;
	this.inscricao_estadual = inscricao_estadual;
	this.distribuidor_produtos = distribuidor_produtos;
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

    public String getCnpj()
    {
	return cnpj;
    }

    public void setCnpj(String cnpj)
    {
	this.cnpj = cnpj;
    }

    public String getInscricao_estadual()
    {
	return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual)
    {
	this.inscricao_estadual = inscricao_estadual;
    }

    public boolean isDistribuidor_produtos()
    {
	return distribuidor_produtos;
    }

    public void setDistribuidor_produtos(boolean distribuidor_produtos)
    {
	this.distribuidor_produtos = distribuidor_produtos;
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

    public ArrayList<Produtor> getProdutor()
    {
	return produtor;
    }

    public void setProdutor(ArrayList<Produtor> produtor)
    {
	this.produtor = produtor;
    }

    @Override
    public int hashCode()
    {
	int hash = 7;
	hash = 71 * hash + Objects.hashCode(this.nome);
	hash = 71 * hash + Objects.hashCode(this.inscricao_estadual);
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
	final Grupo other = (Grupo) obj;
	if (!Objects.equals(this.nome, other.nome))
	{
	    return false;
	}
	if (!Objects.equals(this.inscricao_estadual, other.inscricao_estadual))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "Grupo{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ", cnpj=" + cnpj + ", inscricao_estadual=" + inscricao_estadual + ", distribuidor_produtos=" + distribuidor_produtos + ", registro_ativo=" + registro_ativo + ", cidade=" + cidade + ", produtor=" + produtor + '}';
    }
    
    
}
