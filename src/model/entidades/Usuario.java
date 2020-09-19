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
public class Usuario implements Serializable
{
    private int id;
    private String nome;
    private String login;
    private String senha;
    private boolean ativo;
    
   private ArrayList<PermissaoUsuario> permissaoUsuario = new ArrayList<PermissaoUsuario>();

    public Usuario()
    {
    }

    public Usuario(String nome, String login, String senha, boolean ativo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
    }

        
    public Usuario(int id, String nome, String login, String senha, boolean ativo)
    {
	this.id = id;
	this.nome = nome;
	this.login = login;
	this.senha = senha;
	this.ativo = ativo;
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

    public String getLogin()
    {
	return login;
    }

    public void setLogin(String login)
    {
	this.login = login;
    }

    public String getSenha()
    {
	return senha;
    }

    public void setSenha(String senha)
    {
	this.senha = senha;
    }

    public boolean isAtivo()
    {
	return ativo;
    }

    public void setAtivo(boolean ativo)
    {
	this.ativo = ativo;
    }

    public ArrayList<PermissaoUsuario> getPermissaoUsuario()
    {
	return permissaoUsuario;
    }

    public void setPermissaoUsuario(ArrayList<PermissaoUsuario> permissaoUsuario)
    {
	this.permissaoUsuario = permissaoUsuario;
    }

    @Override
    public int hashCode()
    {
	int hash = 7;
	hash = 97 * hash + Objects.hashCode(this.nome);
	hash = 97 * hash + Objects.hashCode(this.login);
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
	final Usuario other = (Usuario) obj;
	if (!Objects.equals(this.nome, other.nome))
	{
	    return false;
	}
	if (!Objects.equals(this.login, other.login))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	
	
	return "Usuario{" + "id=" + id + ", \nnome=" + nome + ", \nlogin=" + login + ", \nsenha=" + senha + ", \nativo=" + ativo + ", \n   permissaoUsuario=" + permissaoUsuario + '}';
    }
    
    
    
    
    
    
}
