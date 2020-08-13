package model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author maycon
 */
public class Produtor implements Serializable {

    private int id;

    private String nome;
    private String nome_propriedade;
    private String cpf;
    private String endereco;
    private int numero;
    private String bairro;
    private String telefone;
    private Double latitude;
    private Double longitude;
    private String certificao_organicos;
    private boolean venda_consumidoFinal;
    private boolean registro_ativo;

    // Relacionamentos
    private Certificadora certificadora;
    private Grupo grupo;
    private Cidade cidade;
    ArrayList<ProdutorProduto> produtorProduto = new ArrayList<ProdutorProduto>();

    //Construtor vazio
    public Produtor() {
    }

    //Construtor Completo
    public Produtor(int id, String nome, String nome_propriedade, String cpf, String endereco, int numero, String bairro, String telefone, Double latitude, Double longitude, String certificao_organicos, boolean venda_consumidoFinal, boolean registro_ativo, Certificadora certificadora, Grupo grupo, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.nome_propriedade = nome_propriedade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.telefone = telefone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.certificao_organicos = certificao_organicos;
        this.venda_consumidoFinal = venda_consumidoFinal;
        this.registro_ativo = registro_ativo;
        this.certificadora = certificadora;
        this.grupo = grupo;
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

    public String getNome_propriedade() {
        return nome_propriedade;
    }

    public void setNome_propriedade(String nome_propriedade) {
        this.nome_propriedade = nome_propriedade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCertificao_organicos() {
        return certificao_organicos;
    }

    public void setCertificao_organicos(String certificao_organicos) {
        this.certificao_organicos = certificao_organicos;
    }

    public boolean isVenda_consumidoFinal() {
        return venda_consumidoFinal;
    }

    public void setVenda_consumidoFinal(boolean venda_consumidoFinal) {
        this.venda_consumidoFinal = venda_consumidoFinal;
    }

    public boolean isRegistro_ativo() {
        return registro_ativo;
    }

    public void setRegistro_ativo(boolean registro_ativo) {
        this.registro_ativo = registro_ativo;
    }

    public Certificadora getCertificadora() {
        return certificadora;
    }

    public void setCertificadora(Certificadora certificadora) {
        this.certificadora = certificadora;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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
        int hash = 3;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.nome_propriedade);
        hash = 73 * hash + Objects.hashCode(this.cpf);
        hash = 73 * hash + Objects.hashCode(this.endereco);
        hash = 73 * hash + this.numero;
        hash = 73 * hash + Objects.hashCode(this.bairro);
        hash = 73 * hash + Objects.hashCode(this.telefone);
        hash = 73 * hash + Objects.hashCode(this.latitude);
        hash = 73 * hash + Objects.hashCode(this.longitude);
        hash = 73 * hash + Objects.hashCode(this.certificao_organicos);
        hash = 73 * hash + (this.venda_consumidoFinal ? 1 : 0);
        hash = 73 * hash + (this.registro_ativo ? 1 : 0);
        hash = 73 * hash + Objects.hashCode(this.certificadora);
        hash = 73 * hash + Objects.hashCode(this.grupo);
        hash = 73 * hash + Objects.hashCode(this.cidade);
        hash = 73 * hash + Objects.hashCode(this.produtorProduto);
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
        final Produtor other = (Produtor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.venda_consumidoFinal != other.venda_consumidoFinal) {
            return false;
        }
        if (this.registro_ativo != other.registro_ativo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nome_propriedade, other.nome_propriedade)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.certificao_organicos, other.certificao_organicos)) {
            return false;
        }
        if (!Objects.equals(this.latitude, other.latitude)) {
            return false;
        }
        if (!Objects.equals(this.longitude, other.longitude)) {
            return false;
        }
        if (!Objects.equals(this.certificadora, other.certificadora)) {
            return false;
        }
        if (!Objects.equals(this.grupo, other.grupo)) {
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

    //ToString
    @Override
    public String toString() {
        return "Produtor{" + "id=" + id + ", nome=" + nome + ", nome_propriedade=" + nome_propriedade + ", cpf=" + cpf + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ", telefone=" + telefone + ", latitude=" + latitude + ", longitude=" + longitude + ", certificao_organicos=" + certificao_organicos + ", venda_consumidoFinal=" + venda_consumidoFinal + ", registro_ativo=" + registro_ativo + ", certificadora=" + certificadora + ", grupo=" + grupo + ", cidade=" + cidade + ", produtorProduto=" + produtorProduto + '}';
    }

}
