/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Andre
 */
public class ProdutorProduto implements Serializable
{

    private int id;

    private Produtor produtor;

    private Produto produto;

    private PontosVenda pontosvenda;

    private int dia_semana;
    private Date horario;
    private boolean pausado;

    public ProdutorProduto()
    {
    }

    public ProdutorProduto(int id, Produtor produtor, Produto produto, PontosVenda pontosvenda, int dia_semana, Date horario, boolean pausado)
    {
	this.id = id;
	this.produtor = produtor;
	this.produto = produto;
	this.pontosvenda = pontosvenda;
	this.dia_semana = dia_semana;
	this.horario = horario;
	this.pausado = pausado;
    }

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public Produtor getProdutor()
    {
	return produtor;
    }

    public void setProdutor(Produtor produtor)
    {
	this.produtor = produtor;
    }

    public Produto getProduto()
    {
	return produto;
    }

    public void setProduto(Produto produto)
    {
	this.produto = produto;
    }

    public PontosVenda getPontosvenda()
    {
	return pontosvenda;
    }

    public void setPontosvenda(PontosVenda pontosvenda)
    {
	this.pontosvenda = pontosvenda;
    }

    public int getDia_semana()
    {
	return dia_semana;
    }

    public void setDia_semana(int dia_semana)
    {
	this.dia_semana = dia_semana;
    }

    public Date getHorario()
    {
	return horario;
    }

    public void setHorario(Date horario)
    {
	this.horario = horario;
    }

    public boolean isPausado()
    {
	return pausado;
    }

    public void setPausado(boolean pausado)
    {
	this.pausado = pausado;
    }

    @Override
    public int hashCode()
    {
	int hash = 3;
	hash = 31 * hash + Objects.hashCode(this.produtor);
	hash = 31 * hash + Objects.hashCode(this.produto);
	hash = 31 * hash + Objects.hashCode(this.pontosvenda);
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
	final ProdutorProduto other = (ProdutorProduto) obj;
	if (!Objects.equals(this.produtor, other.produtor))
	{
	    return false;
	}
	if (!Objects.equals(this.produto, other.produto))
	{
	    return false;
	}
	if (!Objects.equals(this.pontosvenda, other.pontosvenda))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "ProdutorProduto{" + "id=" + id + ", produtor=" + produtor + ", produto=" + produto + ", pontosvenda=" + pontosvenda + ", dia_semana=" + dia_semana + ", horario=" + horario + ", pausado=" + pausado + '}';
    }
    
    

}
