package model.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class ProdutorProduto implements Serializable {

    private int id;
    private Produtor produtor;
    private Produto produto;
    private PostosVenda postosVenda;
    private Date diaSemana;

    //Construtor vazio
    public ProdutorProduto() {
    }

    //Construtor Completo
    public ProdutorProduto(int id, Produtor produtor, Produto produto, PostosVenda pontosVenda, Date diaSemana) {
        this.id = id;
        this.produtor = produtor;
        this.produto = produto;
        this.postosVenda = pontosVenda;
        this.diaSemana = diaSemana;
    }

    //Gett sett.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public PostosVenda getPostosVenda() {
        return postosVenda;
    }

    public void setPostosVenda(PostosVenda pontosVenda) {
        this.postosVenda = postosVenda;
    }

    public Date getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(Date diaSemana) {
        this.diaSemana = diaSemana;
    }

    // HashCode e Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.produtor);
        hash = 37 * hash + Objects.hashCode(this.produto);
        hash = 37 * hash + Objects.hashCode(this.postosVenda);
        hash = 37 * hash + Objects.hashCode(this.diaSemana);
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
        final ProdutorProduto other = (ProdutorProduto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.produtor, other.produtor)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.postosVenda, other.postosVenda)) {
            return false;
        }
        if (!Objects.equals(this.diaSemana, other.diaSemana)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        return "ProdutorProduto{" + "id=" + id + ", produtor=" + produtor + ", produto=" + produto + ", pontosVenda=" + postosVenda + ", diaSemana=" + diaSemana + '}';
    }

}
