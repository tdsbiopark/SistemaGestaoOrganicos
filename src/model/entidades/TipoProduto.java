package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class TipoProduto implements Serializable {

    private int id;
    private String nome;
    private boolean registro_ativo;

    ArrayList<Produto> produto = new ArrayList<>();

    // Construtor vazio
    public TipoProduto() {
    }

    // Construtor completo
    public TipoProduto(int id, String nome, boolean registro_ativo) {
        this.id = id;
        this.nome = nome;
        this.registro_ativo = registro_ativo;
    }

    // Gett e Sett.
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

    public boolean isRegistro_ativo() {
        return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo) {
        this.registro_ativo = registro_ativo;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    // HashCode e Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + (this.registro_ativo ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.produto);
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
        final TipoProduto other = (TipoProduto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.registro_ativo != other.registro_ativo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    // ToString
    @Override
    public String toString() {
        return "TipoProduto{" + "id=" + id + ", nome=" + nome + ", registro_ativo=" + registro_ativo + ", produto=" + produto + '}';
    }

}
