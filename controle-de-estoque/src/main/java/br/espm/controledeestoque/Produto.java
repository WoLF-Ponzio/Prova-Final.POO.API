package br.espm.controledeestoque;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @JsonProperty("idProduto")
    private String idProduto;
    @JsonProperty("nomeProduto")
    private String nomeProduto;
    @JsonProperty("marcaProduto")
    private String marcaProduto;
    @JsonProperty("unidadeDeMedida")
    private String unidadeDeMedida;
    @JsonProperty("quantidadeProduto")
    private double quantidadeProduto;
    @JsonProperty("descProduto")
    private String descProduto;

    public Produto(){

    }

    public Produto(String idProduto, String nomeProduto, String marcaProduto, String unidadeDeMedida, double quantidadeProduto, String descProduto){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.unidadeDeMedida = unidadeDeMedida;
        this.quantidadeProduto = quantidadeProduto;
        this.descProduto = descProduto;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public double getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public void setQuantidadeProduto(double quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }


}
