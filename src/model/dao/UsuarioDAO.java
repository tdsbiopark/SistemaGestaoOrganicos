/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entidades.Usuario;

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class UsuarioDAO extends DAO<Usuario> {

    @Override
    public void inserir(Usuario objeto) throws SQLException {
        executarConsultaDML("INSERT INTO usuario (nome, login, senha, registro_ativo) VALUES (?, ?, ?, ?) ",objeto.getNome(), objeto.getLogin(), objeto.getSenha(), objeto.isAtivo());
    }

    @Override
    public void excluir(Usuario objeto) throws SQLException {
        executarConsultaDML("DELETE FROM estado usuario id = ? ", objeto.getId());
    }

    @Override
    public void alterar(Usuario objeto) throws SQLException {
        executarConsultaDML("UPDATE usuario SET nome = ?, login = ?, senha = ?, registro_ativo = ? where id = ? ", objeto.getNome(), objeto.getLogin(), objeto.getSenha(), objeto.isAtivo(), objeto.getId());
    }

    @Override
    public ArrayList<Usuario> pesquisar(String filtro) throws SQLException {
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = " SELECT id, nome, login, registro_ativo FROM usuario";
        if (filtro != null) {
            sql = sql + " where id = ?";
        }

        rs = executarConsultaSQL(sql, Integer.parseInt(filtro));

        while (rs.next()) {
            Usuario e = new Usuario();
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setLogin(rs.getString("login"));
            e.setAtivo(rs.getBoolean("registro_ativo"));

            usuarios.add(e);
        }

        return usuarios;
    }

    @Override
    public ArrayList<Usuario> listar() throws SQLException {
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        rs = executarConsultaSQL(" SELECT id, nome, login, registro_ativo FROM usuario", null);

        while (rs.next()) {
            Usuario e = new Usuario();
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setLogin(rs.getString("login"));
            e.setAtivo(rs.getBoolean("registro_ativo"));

            usuarios.add(e);

        }

        return usuarios;
    }

}
