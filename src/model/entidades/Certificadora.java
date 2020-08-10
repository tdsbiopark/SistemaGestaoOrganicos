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
public class Certificadora implements Serializable
{

    private int id;
    private String nome;
    private boolean registro_ativo;
    
    private ArrayList<Produtor> produtores = new ArrayList<Produtor>();

    public Certificadora()
    {
    }

    public Certificadora(int id, String nome, boolean registro_ativo)
    {
	this.id = id;
	this.nome = nome;
	this.registro_ativo = registro_ativo;
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

    public boolean isRegistro_ativo()
    {
	return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo)
    {
	this.registro_ativo = registro_ativo;
    }

    public ArrayList<Produtor> getProdutores()
    {
	return produtores;
    }

    public void setProdutores(ArrayList<Produtor> produtores)
    {
	this.produtores = produtores;
    }

    @Override
    public int hashCode()
    {
	int hash = 5;
	hash = 97 * hash + this.id;
	hash = 97 * hash + Objects.hashCode(this.nome);
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
	final Certificadora other = (Certificadora) obj;
	if (this.id != other.id)
	{
	    return false;
	}
	if (!Objects.equals(this.nome, other.nome))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "Certificadora{" + "id=" + id + ", nome=" + nome + ", registro_ativo=" + registro_ativo + ", produtor=" + produtores + '}';
    }
    
    
    
}
