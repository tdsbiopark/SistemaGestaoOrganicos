package model.entidades;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class Permissao implements Serializable {

    private int id;
    private String nome;

    // Construtor vazio
    public Permissao() {
    }

    // Construtor completo
    public Permissao(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    // HashCode e Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

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
        final Permissao other = (Permissao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    // ToString
    @Override
    public String toString() {
        return "Permissao{" + "id=" + id + ", nome=" + nome + '}';
    }

}
