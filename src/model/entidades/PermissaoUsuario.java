/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.util.Objects;

/**
 *
 * @author Andre
 */
public class PermissaoUsuario
{
  
    private Permissao permissao;
    
    private boolean pemitido;

    public PermissaoUsuario()
    {
    }

    public PermissaoUsuario(Permissao permissao, boolean pemitido)
    {
	this.permissao = permissao;
	this.pemitido = pemitido;
    }

    public Permissao getPermissao()
    {
	return permissao;
    }

    public void setPermissao(Permissao permissao)
    {
	this.permissao = permissao;
    }

    public boolean isPemitido()
    {
	return pemitido;
    }

    public void setPemitido(boolean pemitido)
    {
	this.pemitido = pemitido;
    }

    @Override
    public int hashCode()
    {
	int hash = 7;
	hash = 67 * hash + Objects.hashCode(this.permissao);
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
	final PermissaoUsuario other = (PermissaoUsuario) obj;
	if (!Objects.equals(this.permissao, other.permissao))
	{
	    return false;
	}
	return true;
    }
    
    

    @Override
    public String toString()
    {
	return "\n   PermissaoUsuario{" + "permissao=" + permissao + ", pemitido=" + pemitido + '}';
    }

 
    
    
    
    

}
