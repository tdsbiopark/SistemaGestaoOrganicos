/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import model.entidades.enums.Unidade;

/**
 *
 * @author Andre
 */
public class Produto implements Serializable
{
    private Integer id;    
    
    private String nome;
    private String descricao;
    private Double preco_unitario;
    
    //Usa enums para defnir as unidades
    private Integer unidade;
    
    private boolean registro_ativo;
    
    private TipoProduto tipoproduto;
    
    private Date dataRegistro;
    
    private ArrayList<ProdutorProduto> ProdutorProdutos = new ArrayList<ProdutorProduto>();

    public Produto()
    {
    }

    public Produto(Integer id, String nome, String descricao, Double preco_unitario, Unidade unidade, boolean registro_ativo, TipoProduto tipoproduto)
    {
	this.id = id;
	this.nome = nome;
	this.descricao = descricao;
	this.preco_unitario = preco_unitario;
	//usa enums:
	setUnidade(unidade);
	this.registro_ativo = registro_ativo;
	this.tipoproduto = tipoproduto;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Integer getId()
    {
	return id;
    }

    public void setId(Integer id)
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

    public String getDescricao()
    {
	return descricao;
    }

    public void setDescricao(String descricao)
    {
	this.descricao = descricao;
    }

    public Double getPreco_unitario()
    {
	return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario)
    {
	this.preco_unitario = preco_unitario;
    }    
    
    // converte o codigo para o enum
    public Unidade getUnidade()
    {
        if (unidade != null)
	{
            return Unidade.valueOf(unidade);
        } else {
            return null;
        }
    }

    // recebe um enum e grava o codigo
    public void setUnidade(Unidade unidade)
    {
	if (unidade != null)
	{
	    this.unidade = unidade.getCodigo();
	}
	
    }

    public boolean isRegistro_ativo()
    {
	return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo)
    {
	this.registro_ativo = registro_ativo;
    }

    public TipoProduto getTipoproduto()
    {
	return tipoproduto;
    }

    public void setTipoproduto(TipoProduto tipoproduto)
    {
	this.tipoproduto = tipoproduto;
    }

    public ArrayList<ProdutorProduto> getProdutorProdutos()
    {
	return ProdutorProdutos;
    }

    public void setProdutorProdutos(ArrayList<ProdutorProduto> ProdutorProdutos)
    {
	this.ProdutorProdutos = ProdutorProdutos;
    }

    @Override
    public int hashCode()
    {
	int hash = 7;
	hash = 83 * hash + Objects.hashCode(this.nome);
	hash = 83 * hash + Objects.hashCode(this.tipoproduto);
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
	final Produto other = (Produto) obj;
	if (!Objects.equals(this.nome, other.nome))
	{
	    return false;
	}
	if (!Objects.equals(this.tipoproduto, other.tipoproduto))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco_unitario=" + preco_unitario + ", unidade=" + getUnidade() + ", registro_ativo=" + registro_ativo + ", tipoproduto=" + tipoproduto + ", ProdutorProdutos=" + ProdutorProdutos + '}';
    }


    
    
}
