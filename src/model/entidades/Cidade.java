/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;

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
        
    
}
