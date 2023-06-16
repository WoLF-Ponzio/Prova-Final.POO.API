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
    @JsonProperty("unidadeDeMedida")
    private String unidadeDeMedida;
    @JsonProperty("quantidadeProduto")
    private double quantidadeProduto;

    public Produto(){

    }

    public Produto(String idProduto, String nomeProduto, double quantidadeProduto, String unidadeDeMedida){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }


    public double getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidadeProduto(double quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }


}
