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
public class Produtor implements Serializable
{
  
    private Integer id;
    private String nome;
    private String nome_propriedade;
    private String cpf_cnpj;
    private int numero;
    private String telefone;
    private String endereco;
    private String bairro;
    private Double latitude;
    private Double longitude;
    private String certificacao_organicos;
    private boolean venda_consumidorfinal;
    private boolean registro_ativo;

    private Certificadora certificadora;
    private Grupo grupo;
    private Cidade cidade;
    private ArrayList<ProdutorProduto> ProdutorProdutos = new ArrayList<ProdutorProduto>();

    public Produtor()
    {
    }

    public Produtor(int id, String nome, String nome_propriedade, String cpf_cnpj, int numero, String telefone, String endereco, String bairro, Double latitude, Double longitude, String certificacao_organicos, boolean venda_consumidorfinal, boolean registro_ativo, Certificadora certificadora, Grupo grupo, Cidade cidade)
    {
	this.id = id;
	this.nome = nome;
	this.nome_propriedade = nome_propriedade;
	this.cpf_cnpj = cpf_cnpj;
	this.numero = numero;
	this.telefone = telefone;
	this.endereco = endereco;
	this.bairro = bairro;
	this.latitude = latitude;
	this.longitude = longitude;
	this.certificacao_organicos = certificacao_organicos;
	this.venda_consumidorfinal = venda_consumidorfinal;
	this.registro_ativo = registro_ativo;
	this.certificadora = certificadora;
	this.grupo = grupo;
	this.cidade = cidade;
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

    public String getNome_propriedade()
    {
	return nome_propriedade;
    }

    public void setNome_propriedade(String nome_propriedade)
    {
	this.nome_propriedade = nome_propriedade;
    }

    public String getCpf_cnpj()
    {
	return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj)
    {
	this.cpf_cnpj = cpf_cnpj;
    }

    public int getNumero()
    {
	return numero;
    }

    public void setNumero(int numero)
    {
	this.numero = numero;
    }

    public String getTelefone()
    {
	return telefone;
    }

    public void setTelefone(String telefone)
    {
	this.telefone = telefone;
    }

    public String getEndereco()
    {
	return endereco;
    }

    public void setEndereco(String endereco)
    {
	this.endereco = endereco;
    }

    public String getBairro()
    {
	return bairro;
    }

    public void setBairro(String bairro)
    {
	this.bairro = bairro;
    }

    public Double getLatitude()
    {
	return latitude;
    }

    public void setLatitude(Double latitude)
    {
	this.latitude = latitude;
    }

    public Double getLongitude()
    {
	return longitude;
    }

    public void setLongitude(Double longitude)
    {
	this.longitude = longitude;
    }

    public String getCertificacao_organicos()
    {
	return certificacao_organicos;
    }

    public void setCertificacao_organicos(String certificacao_organicos)
    {
	this.certificacao_organicos = certificacao_organicos;
    }

    public boolean isVenda_consumidorfinal()
    {
	return venda_consumidorfinal;
    }

    public void setVenda_consumidorfinal(boolean venda_consumidorfinal)
    {
	this.venda_consumidorfinal = venda_consumidorfinal;
    }

    public boolean isRegistro_ativo()
    {
	return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo)
    {
	this.registro_ativo = registro_ativo;
    }

    public Certificadora getCertificadora()
    {
	return certificadora;
    }

    public void setCertificadora(Certificadora certificadora)
    {
	this.certificadora = certificadora;
    }

    public Grupo getGrupo()
    {
	return grupo;
    }

    public void setGrupo(Grupo grupo)
    {
	this.grupo = grupo;
    }

    public Cidade getCidade()
    {
	return cidade;
    }

    public void setCidade(Cidade cidade)
    {
	this.cidade = cidade;
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
	hash = 53 * hash + Objects.hashCode(this.cpf_cnpj);
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
	final Produtor other = (Produtor) obj;
	if (!Objects.equals(this.cpf_cnpj, other.cpf_cnpj))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "Produtor{" + "id=" + id + ", nome=" + nome + ", nome_propriedade=" + nome_propriedade + ", cpf_cnpj=" + cpf_cnpj + ", numero=" + numero + ", telefone=" + telefone + ", endereco=" + endereco + ", bairro=" + bairro + ", latitude=" + latitude + ", longitude=" + longitude + ", certificacao_organicos=" + certificacao_organicos + ", venda_consumidorfinal=" + venda_consumidorfinal + ", registro_ativo=" + registro_ativo + ", certificadora=" + certificadora + ", grupo=" + grupo + ", cidade=" + cidade + ", ProdutorProdutos=" + ProdutorProdutos + '}';
    }
    
    

}
