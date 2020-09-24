/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.testes;

import app.*;
import java.util.ArrayList;
import model.entidades.Permissao;
import model.entidades.PermissaoUsuario;
import model.entidades.Usuario;

/**
 *
 * @author Andre
 */
public class TesteUsuario
{

    public static void main(String[] args)
    {
	//CADSTRO DE PERMISSOES:
	Permissao perm1 = new Permissao(1, "acesso na tela de cadastro de usuario");
	Permissao perm2 = new Permissao(2, "acesso na tela de cadastro de Poduto");
	Permissao perm3 = new Permissao(3, "acesso na tela de cadastro de Produtor");
	Permissao perm4 = new Permissao(4, "acesso na tela de cadastro de Alterar senha");

	//CADASTRO DE USUARIOS:
	Usuario user1 = new Usuario(1, "Jorge", "bahia", "12345", true);
	Usuario user2 = new Usuario(1, "Andre", "lycyo", "12345", true);

	System.out.println("-----------------------------");

	System.out.println(user1.toString());

	System.out.println("-----------------------------");

	PermissaoUsuario per1 = new PermissaoUsuario(perm1, true);
	PermissaoUsuario per2 = new PermissaoUsuario(perm3, false);
	PermissaoUsuario per3 = new PermissaoUsuario(perm4, true);

	ArrayList<PermissaoUsuario> permissaoUsuario1 = new ArrayList<PermissaoUsuario>();
	permissaoUsuario1.add(per1);
	permissaoUsuario1.add(per2);
	permissaoUsuario1.add(per3);

	user1.setPermissaoUsuario(permissaoUsuario1);

	System.out.println(user1.toString());

	System.out.println("-----------------------------");

	ArrayList<PermissaoUsuario> permissaoUsuario2 = new ArrayList<PermissaoUsuario>();
	permissaoUsuario2.add(per2);
	permissaoUsuario2.add(per3);
	permissaoUsuario2.add(per2);

	user2.setPermissaoUsuario(permissaoUsuario2);

	System.out.println(user2.toString());

	System.out.println("-----------------------------");

    }
}
