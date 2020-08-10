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
public class Produtor implements Serializable
{

private int id;
private int certificadora_id;
private int grupo_id;
private int cidade_id;
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

}
