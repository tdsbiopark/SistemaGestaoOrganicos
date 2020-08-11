/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades.enums;

//No banco é gravao o codigo do enum
//ao retornar do banco converte de codigo para o enum correspondente

/**
 *
 * @author Andre
 */
public enum Unidade
{
    UN(1), 
    Kg(2),
    g(3),
    m(4),
    CAIXA(5),
    LITRO(6),
    PACOTE(7),
    SACO(8),
    BANDEJA(8),
    MOLHO(10);

    //=============================================================
    private int codigo;

    private Unidade(int codigo)
    {
	this.codigo = codigo;
    }

    public int getCodigo()
    {
	return codigo;
    }

    public static Unidade valueOf(int codigo)
    {
	for (Unidade value : Unidade.values())
	{
	    if (value.getCodigo() == codigo)
	    {
		return value;
	    }
	}
	throw new IllegalArgumentException("Código da Unidade Inválida!");
    } 
}
