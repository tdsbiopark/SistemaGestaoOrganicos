package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author mayco
 */
public class Usuario implements Serializable {

    private int id;
    private String nome;
    private String login;
    private String senha;
    private boolean registro_ativo;

    private ArrayList<PermissaoUsuario> permissaoUsuario = new ArrayList<PermissaoUsuario>();

    // Construtor vazio.
    public Usuario() {
    }

    // Construtor completo
    public Usuario(int id, String nome, String login, String senha, boolean registro_ativo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.registro_ativo = registro_ativo;
    }

    // Get e Set.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isRegistro_ativo() {
        return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo) {
        this.registro_ativo = registro_ativo;
    }

    public ArrayList<PermissaoUsuario> getPermissaoUsuario() {
        return permissaoUsuario;
    }

    public void setPermissaoUsuario(ArrayList<PermissaoUsuario> permissaoUsuario) {
        this.permissaoUsuario = permissaoUsuario;
    }

    // HasCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.login);
        hash = 23 * hash + Objects.hashCode(this.senha);
        hash = 23 * hash + (this.registro_ativo ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.permissaoUsuario);
        return hash;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.registro_ativo != other.registro_ativo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.permissaoUsuario, other.permissaoUsuario)) {
            return false;
        }
        return true;
    }

    // TO String.
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", registro_ativo=" + registro_ativo + ", permissaoUsuario=" + permissaoUsuario + '}';
    }

}
