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
public class Cidade implements Serializable
{

    private int id;
    private String nome;    

    private Estado estado;

    private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
    
    private ArrayList<Produtor> produtores = new ArrayList<Produtor>();

    private ArrayList<PontosVenda> pontosVenda = new ArrayList<PontosVenda>();

    public Cidade()
    {
    }

    public Cidade(int id, String nome, Estado estado)
    {
	this.id = id;
	this.nome = nome;
	this.estado = estado;
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

    public Estado getEstado()
    {
	return estado;
    }

    public void setEstado(Estado estado)
    {
	this.estado = estado;
    }

    public ArrayList<Grupo> getGrupos()
    {
	return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos)
    {
	this.grupos = grupos;
    }

    public ArrayList<Produtor> getProdutores()
    {
	return produtores;
    }

    public void setProdutores(ArrayList<Produtor> produtores)
    {
	this.produtores = produtores;
    }

    public ArrayList<PontosVenda> getPontosVenda()
    {
	return pontosVenda;
    }

    public void setPontosVenda(ArrayList<PontosVenda> pontosVenda)
    {
	this.pontosVenda = pontosVenda;
    }

    @Override
    public int hashCode()
    {
	int hash = 5;
	hash = 97 * hash + Objects.hashCode(this.nome);
	hash = 97 * hash + Objects.hashCode(this.estado);
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
	final Cidade other = (Cidade) obj;
	if (!Objects.equals(this.nome, other.nome))
	{
	    return false;
	}
	if (!Objects.equals(this.estado, other.estado))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "\nCidade{" + "id=" + id + ", nome=" + nome + ", estado=" + estado + ", grupos=" + grupos + ", produtores=" + produtores + ", pontosVenda=" + pontosVenda + '}';
    }
    
    
        
    
}
