/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.io.Serializable;

/**
 *
 * @author Andre
 */
public class Permissao implements Serializable
{

    private int id;
    private String nome;

    public Permissao()
    {
    }

    public Permissao(int id, String nome)
    {
	this.id = id;
	this.nome = nome;
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

    @Override
    public String toString()
    {
	return "Permissao{" + "id=" + id + ", nome=" + nome + '}';
    }

    

    

}
