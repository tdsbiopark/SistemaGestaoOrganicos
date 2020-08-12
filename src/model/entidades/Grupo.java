package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class Grupo implements Serializable {

    private int id;
    private String nome;
    private String endereco;
    private int numero;
    private String bairro;
    private String cnpj;
    private String inscricao_estadual;
    private boolean distribuidor_produtos;
    private boolean registro_ativo;

    //Associações
    private Cidade cidade;
    private ArrayList<Produto> produto = new ArrayList<Produto>();

    //Construtor vazio
    public Grupo() {
    }

    //Construtor completo
    public Grupo(int id, String nome, String endereco, int numero, String bairro, String cnpj, String inscricao_estadual, boolean distribuidor_produtos, boolean registro_ativo, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
        this.distribuidor_produtos = distribuidor_produtos;
        this.registro_ativo = registro_ativo;
        this.cidade = cidade;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public boolean isDistribuidor_produtos() {
        return distribuidor_produtos;
    }

    public void setDistribuidor_produtos(boolean distribuidor_produtos) {
        this.distribuidor_produtos = distribuidor_produtos;
    }

    public boolean isRegistro_ativo() {
        return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo) {
        this.registro_ativo = registro_ativo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
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
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.endereco);
        hash = 59 * hash + this.numero;
        hash = 59 * hash + Objects.hashCode(this.bairro);
        hash = 59 * hash + Objects.hashCode(this.cnpj);
        hash = 59 * hash + Objects.hashCode(this.inscricao_estadual);
        hash = 59 * hash + (this.distribuidor_produtos ? 1 : 0);
        hash = 59 * hash + (this.registro_ativo ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.cidade);
        hash = 59 * hash + Objects.hashCode(this.produto);
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
        final Grupo other = (Grupo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.distribuidor_produtos != other.distribuidor_produtos) {
            return false;
        }
        if (this.registro_ativo != other.registro_ativo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.inscricao_estadual, other.inscricao_estadual)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ", cnpj=" + cnpj + ", inscricao_estadual=" + inscricao_estadual + ", distribuidor_produtos=" + distribuidor_produtos + ", registro_ativo=" + registro_ativo + ", cidade=" + cidade + ", produto=" + produto + '}';
    }

}
