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
public class Estado implements Serializable
{

    private int id;
    private String nome;
    private String sigla;

    private ArrayList<Cidade> cidades = new ArrayList<Cidade>();

    public Estado()
    {
    }

    public Estado(int id, String nome, String sigla)
    {
	this.id = id;
	this.nome = nome;
	this.sigla = sigla;
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

    public String getSigla()
    {
	return sigla;
    }

    public void setSigla(String sigla)
    {
	this.sigla = sigla;
    }

    public ArrayList<Cidade> getCidades()
    {
	return cidades;
    }

    public void setCidades(ArrayList<Cidade> cidades)
    {
	this.cidades = cidades;
    }

    @Override
    public int hashCode()
    {
	int hash = 3;
	hash = 89 * hash + Objects.hashCode(this.nome);
	hash = 89 * hash + Objects.hashCode(this.sigla);
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
	final Estado other = (Estado) obj;
	if (!Objects.equals(this.nome, other.nome))
	{
	    return false;
	}
	if (!Objects.equals(this.sigla, other.sigla))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "Estado{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", cidade=" + cidades + '}';
    }
    
    
    
}
