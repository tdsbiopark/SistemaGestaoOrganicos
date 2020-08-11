package model.entidades;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class PermissaoUsuario implements Serializable {

    private Permissao permissao;
    private boolean permitido;
    private Usuario usuario;

    // Construtor vazio
    public PermissaoUsuario() {
    }

    // Construtor completo
    public PermissaoUsuario(Permissao permissao, boolean permitido, Usuario usuario) {
        this.permissao = permissao;
        this.permitido = permitido;
        this.usuario = usuario;
    }

    // Get e Set.
    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

    public boolean isPermitido() {
        return permitido;
    }

    public void setPermitido(boolean permitido) {
        this.permitido = permitido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // HasCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.permissao);
        hash = 71 * hash + (this.permitido ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.usuario);
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
        final PermissaoUsuario other = (PermissaoUsuario) obj;
        if (this.permitido != other.permitido) {
            return false;
        }
        if (!Objects.equals(this.permissao, other.permissao)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    // TOString
    @Override
    public String toString() {
        return "PermissaoUsuario{" + "permissao=" + permissao + ", permitido=" + permitido + ", usuario=" + usuario + '}';
    }

}
