package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author mayco
 */
public class Cidade implements Serializable {

    private int id;
    private String nome;

    //Associações
    private Estado estado;
    private ArrayList<Produtor> produtor = new ArrayList<Produtor>();
    private ArrayList<PostosVenda> postosVendas = new ArrayList<PostosVenda>();
    private ArrayList<Grupo> grupo = new ArrayList<Grupo>();

    //Construtor vazio
    public Cidade() {
    }

    //Construtor completo
    public Cidade(int id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    //Gett sett.
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Produtor> getProdutor() {
        return produtor;
    }

    public void setProdutor(ArrayList<Produtor> produtor) {
        this.produtor = produtor;
    }

    public ArrayList<PostosVenda> getPostosVendas() {
        return postosVendas;
    }

    public void setPostosVendas(ArrayList<PostosVenda> postosVendas) {
        this.postosVendas = postosVendas;
    }

    public ArrayList<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<Grupo> grupo) {
        this.grupo = grupo;
    }

    // HashCode e Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.estado);
        hash = 37 * hash + Objects.hashCode(this.produtor);
        hash = 37 * hash + Objects.hashCode(this.postosVendas);
        hash = 37 * hash + Objects.hashCode(this.grupo);
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
        final Cidade other = (Cidade) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.produtor, other.produtor)) {
            return false;
        }
        if (!Objects.equals(this.postosVendas, other.postosVendas)) {
            return false;
        }
        if (!Objects.equals(this.grupo, other.grupo)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + ", estado=" + estado + ", produtor=" + produtor + ", postosVendas=" + postosVendas + ", grupo=" + grupo + '}';
    }

}
