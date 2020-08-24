/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades.enums;

//No banco é gravao o codigo do enum
import java.util.ArrayList;

//ao retornar do banco converte de codigo para o enum correspondente
/**
 * Unidades de medita com tipos enumerados
 *
 * @author Andre
 */
public enum Unidade
{
    /**
     * Sem unidade definida
     */
    NAO_DEFINIDO(0),
    /**
     * Unidade
     */
    UN(1),
    /**
     * Kilograma
     */
    Kg(2),
    /**
     * Grama
     */
    g(3),
    /**
     * Metro
     */
    m(4),
    /**
     * Caixa
     */
    CAIXA(5),
    LITRO(6),
    PACOTE(7),
    BANDEJA(8),
    MOLHO(9),
    SACO(10);

    private int codigo;

    private Unidade(int codigo)
    {
	this.codigo = codigo;
    }

    public int getCodigo()
    {
	return codigo;
    }

    public static Unidade valueOf(Integer codigo)
    {
	if (codigo == null)
	{
	    return Unidade.NAO_DEFINIDO;
	}

	for (Unidade value : Unidade.values())
	{
	    if (value.getCodigo() == codigo)
	    {
		return value;
	    }
	}
	throw new IllegalArgumentException("Código da Unidade de medida Inválida!");
    }

    /**
     * retorna um lista dos enums
     *
     * @return
     */
    public ArrayList<Unidade> getEnumsUnidadade()
    {
	ArrayList<Unidade> list = new ArrayList<>();

	for (Unidade und : Unidade.values())
	{
	    list.add(und);
	}

	return list;
    }
}
