package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class Certificadora implements Serializable {

    private int id;
    private String nome;
    private boolean registro_ativo;

    //Associação
    ArrayList<Produtor> produtor = new ArrayList<Produtor>();

    //Construtor vazio
    public Certificadora() {
    }

    //Construtor Completo
    public Certificadora(int id, String nome, boolean registro_ativo) {
        this.id = id;
        this.nome = nome;
        this.registro_ativo = registro_ativo;
    }

    //Gett sett
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

    public ArrayList<Produtor> getProdutor() {
        return produtor;
    }

    public void setProdutor(ArrayList<Produtor> produtor) {
        this.produtor = produtor;
    }

    // HashCode e Equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + (this.registro_ativo ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.produtor);
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
        final Certificadora other = (Certificadora) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.registro_ativo != other.registro_ativo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.produtor, other.produtor)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        return "Certificadora{" + "id=" + id + ", nome=" + nome + ", registro_ativo=" + registro_ativo + ", produtor=" + produtor + '}';
    }

}
