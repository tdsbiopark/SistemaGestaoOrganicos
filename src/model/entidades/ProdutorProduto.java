/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Andre
 */
public class ProdutorProduto implements Serializable
{
    private int id;
    private int produtor_id;
    private int produto_id;
    private int pontosvenda_id;
    private int dia_semana;
    private Date horario;
    private boolean pausado;
    
}
