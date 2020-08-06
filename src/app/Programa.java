/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.entidades.Usuario;

/**
 *
 * @author Andre
 */
public class Programa
{
    public static void main(String[] args)
    {
	Usuario user1 = new Usuario(1, "Jorge","bahia","12345", true);
	
	System.out.println(user1.getNome());
	
	System.out.println("-----------------------------");
	
	System.out.println(user1.toString());
    }
}
