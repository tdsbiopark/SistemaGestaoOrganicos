/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import db.DbException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entidades.Produtor;

/**
 *
 * @author Andre
 */
public class ProdutorDao extends DAO<Produtor>
{
    private final String SQL_INSERT
	    = " INSERT INTO produtor (                "
	    + " certificadora_id,                     "
	    + " grupo_id,                             "
	    + " nome,                                 "
	    + " nome_propriedade,                     "
	    + " cpf_cnpj,                             "
	    + " endereco,                             "
	    + " numero,                               "
	    + " bairro,                               "
	    + " cidade_id,                            "
	    + " telefone,                             "
	    + " latitude,                             "
	    + " longitude,                            "
	    + " certificacao_organicos,               "
	    + " venda_consumidorfinal,                "
	    + " registro_ativo)                       "
	    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private final String SQL_UPDATE
	    = " UPDATE produtor SET        "
	    + " certificadora_id =?,       "
	    + " grupo_id =?,               "
	    + " nome =?,                   "
	    + " nome_propriedade =?,       "
	    + " cpf_cnpj =?,               "
	    + " endereco =?,               "
	    + " numero =?,                 "
	    + " bairro =?,                 "
	    + " cidade_id =?,              "
	    + " telefone =?,               "
	    + " latitude =?,               "
	    + " longitude =?,              "
	    + " certificacao_organicos =?, "
	    + " venda_consumidorfinal =?,  "
	    + " registro_ativo =?          "
	    + " WHERE id =?                ";

    private final String SQL_DELETEBYID
	    = "DELETE FROM produtor WHERE id = ?";

    private final String SQL_SELECTALL
	    = " SELECT                              "
	    + "     produtor.id,                    "
	    + "     produtor.certificadora_id,      "
	    + "     produtor.grupo_id,              "
	    + "     produtor.nome,                  "
	    + "     produtor.nome_propriedade,      "
	    + "     produtor.cpf_cnpj,              "
	    + "     produtor.endereco,              "
	    + "     produtor.numero,                "
	    + "     produtor.bairro,                "
	    + "     produtor.cidade_id,             "
	    + "     produtor.telefone,              "
	    + "     produtor.latitude,              "
	    + "     produtor.longitude,             "
	    + "     produtor.certificacao_organicos,"
	    + "     produtor.venda_consumidorfinal, "
	    + "     produtor.registro_ativo         "
	    + " FROM bdorganicos.produtor           ";

    private final String SQL_SELECTBYID = SQL_SELECTALL + " WHERE id = ?";

    private final String SQL_SELECTWITHFILTERS = SQL_SELECTALL + " WHERE LOWER(produtor.nome) LIKE ? ";

    @Override
    public void inserir(Produtor obj) throws SQLException
    {
	//Executa o insert e ja retorna o ID gerado:
	obj.setId(executarConsultaDML(SQL_INSERT,
		obj.getCertificadora().getId(),
		obj.getGrupo().getId(),
		obj.getNome(),
		obj.getNome_propriedade(),
		obj.getCpf_cnpj(),
		obj.getEndereco(),
		obj.getNumero(),
		obj.getBairro(),
		obj.getCidade().getId(),
		obj.getTelefone(),
		obj.getLatitude(),
		obj.getLongitude(),
		obj.getCertificacao_organicos(),
		obj.isVenda_consumidorfinal(),
		obj.isRegistro_ativo()));
	if (obj.getId() == null)
	{
	    throw new DbException("Registro nao inserido");
	}
    }

    @Override
    public void excluir(Produtor obj) throws SQLException
    {
	executarConsultaDML(SQL_DELETEBYID, obj.getId());
	if (rowsAffected != 1)
	{
	    throw new DbException("Id informado nao encontrado! Nenhuma linha afetada!");
	}
    }

    @Override
    public void alterar(Produtor obj) throws SQLException
    {
	executarConsultaDML(SQL_UPDATE,
		obj.getCertificadora().getId(),
		obj.getGrupo().getId(),
		obj.getNome(),
		obj.getNome_propriedade(),
		obj.getCpf_cnpj(),
		obj.getEndereco(),
		obj.getNumero(),
		obj.getBairro(),
		obj.getCidade().getId(),
		obj.getTelefone(),
		obj.getLatitude(),
		obj.getLongitude(),
		obj.getCertificacao_organicos(),
		obj.isVenda_consumidorfinal(),
		obj.isRegistro_ativo(),
		obj.getId());
	if (rowsAffected != 1)
	{
	    throw new DbException("Id informado nao encontrado! Nenhuma linha afetada!");
	}
    }

    @Override
    public ArrayList<Produtor> pesquisar(String filtro) throws SQLException
    {
	try
	{
	    return maperObjects(executarConsultaSQL(SQL_SELECTALL + " WHERE LOWER(produtor.nome) LIKE "+ filtro));
	}
	catch (SQLException e)
	{
	    throw new DbException("Erro findAll SQL\n" + ProdutorDao.class.getName() + "\n" + e.getMessage());
	}
    }

    @Override
    public ArrayList<Produtor> listar() throws SQLException
    {
	try
	{
	    return maperObjects(executarConsultaSQL(SQL_SELECTALL));
	}
	catch (SQLException e)
	{
	    throw new DbException("Erro findAll SQL\n" + ProdutorDao.class.getName() + "\n" + e.getMessage());
	}
    }

    //===============================================================================
    // METODO AUXILIAR PARA INSTANCIAR OBJETOS
    //===============================================================================
    /**
     * Passar os dados do resultset para o objeto, propaga a exceção caso der
     * erro
     *
     */
    private ArrayList<Produtor> maperObjects(ResultSet rs) throws SQLException
    {
	//Cria lista:
	ArrayList<Produtor> list = new ArrayList<>();
	//percorre todas as linhas retornadas
	while (rs.next())
	{
	    //PRODUTOR
	    Produtor obj = new Produtor();
	    // Nome das colunas da consulta:
	    obj.setId(rs.getInt("id"));
	    obj.setNome(rs.getString("nome"));
	    obj.setNome_propriedade(rs.getString("nome_propriedade"));
	    obj.setCpf_cnpj(rs.getString("cpf_cnpj"));
	    obj.setNumero(rs.getInt("numero"));
	    obj.setTelefone(rs.getString("telefone"));
	    obj.setEndereco(rs.getString("endereco"));
	    obj.setBairro(rs.getString("bairro"));
	    obj.setLatitude(rs.getDouble("latitude"));
	    obj.setLongitude(rs.getDouble("longitude"));
	    obj.setCertificacao_organicos(rs.getString("certificacao_organicos"));
	    obj.setVenda_consumidorfinal(rs.getBoolean("venda_consumidorfinal"));
	    obj.setRegistro_ativo(rs.getBoolean("registro_ativo"));
	    list.add(obj);
	}
	return list;
    }

}
