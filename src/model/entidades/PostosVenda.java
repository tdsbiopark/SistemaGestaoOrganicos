package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class PostosVenda implements Serializable {

    private int id;
    private String nome;
    private String endereco;
    private int numero;
    private String bairro;
    private boolean regitro_ativo;

    //Associações
    private Cidade cidade;
    private ArrayList<ProdutorProduto> produtorProduto = new ArrayList<ProdutorProduto>();

    //Construtor vazio
    public PostosVenda() {
    }

    //Construtor completo
    public PostosVenda(int id, String nome, String endereco, int numero, String bairro, boolean regitro_ativo, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.regitro_ativo = regitro_ativo;
        this.cidade = cidade;
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

    public boolean isRegitro_ativo() {
        return regitro_ativo;
    }

    public void setRegitro_ativo(boolean regitro_ativo) {
        this.regitro_ativo = regitro_ativo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public ArrayList<ProdutorProduto> getProdutorProduto() {
        return produtorProduto;
    }

    public void setProdutorProduto(ArrayList<ProdutorProduto> produtorProduto) {
        this.produtorProduto = produtorProduto;
    }

    // HashCode e Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.endereco);
        hash = 89 * hash + this.numero;
        hash = 89 * hash + Objects.hashCode(this.bairro);
        hash = 89 * hash + (this.regitro_ativo ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.cidade);
        hash = 89 * hash + Objects.hashCode(this.produtorProduto);
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
        final PostosVenda other = (PostosVenda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.regitro_ativo != other.regitro_ativo) {
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
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.produtorProduto, other.produtorProduto)) {
            return false;
        }
        return true;
    }

    // ToString
    @Override
    public String toString() {
        return "PostosVendas{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ", regitro_ativo=" + regitro_ativo + ", cidade=" + cidade + ", produtorProduto=" + produtorProduto + '}';
    }

}
