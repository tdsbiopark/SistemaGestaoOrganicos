package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class Produto implements Serializable {

    private int id;
    private String tipoproduto_id;
    private String nome;
    private String descricao;
    private Double preco_unitario;
    private int unidade;
    private boolean registro_ativo;

    private TipoProduto tipoProduto;

    private ArrayList<ProdutorProduto> produtorProduto = new ArrayList<ProdutorProduto>();

    //Construtor vazio
    public Produto() {
    }

    //Construtor Completo
    public Produto(int id, String tipoproduto_id, String nome, String descricao, Double preco_unitario, int unidade, boolean registro_ativo, TipoProduto tipoProduto) {
        this.id = id;
        this.tipoproduto_id = tipoproduto_id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco_unitario = preco_unitario;
        this.unidade = unidade;
        this.registro_ativo = registro_ativo;
        this.tipoProduto = tipoProduto;
    }

    //Gett sett.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoproduto_id() {
        return tipoproduto_id;
    }

    public void setTipoproduto_id(String tipoproduto_id) {
        this.tipoproduto_id = tipoproduto_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(Double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public boolean isRegistro_ativo() {
        return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo) {
        this.registro_ativo = registro_ativo;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
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
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.tipoproduto_id);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.preco_unitario);
        hash = 97 * hash + this.unidade;
        hash = 97 * hash + (this.registro_ativo ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.tipoProduto);
        hash = 97 * hash + Objects.hashCode(this.produtorProduto);
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
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.unidade != other.unidade) {
            return false;
        }
        if (this.registro_ativo != other.registro_ativo) {
            return false;
        }
        if (!Objects.equals(this.tipoproduto_id, other.tipoproduto_id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.preco_unitario, other.preco_unitario)) {
            return false;
        }
        if (!Objects.equals(this.tipoProduto, other.tipoProduto)) {
            return false;
        }
        if (!Objects.equals(this.produtorProduto, other.produtorProduto)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", tipoproduto_id=" + tipoproduto_id + ", nome=" + nome + ", descricao=" + descricao + ", preco_unitario=" + preco_unitario + ", unidade=" + unidade + ", registro_ativo=" + registro_ativo + ", tipoProduto=" + tipoProduto + ", produtorProduto=" + produtorProduto + '}';
    }

}
