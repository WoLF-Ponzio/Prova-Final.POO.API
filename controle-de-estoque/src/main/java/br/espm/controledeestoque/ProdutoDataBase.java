package br.espm.controledeestoque;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class ProdutoDataBase {
    
    @Id
    @Column(name = "idProduto")
    String idProduto;

    @Column(name = "nomeProduto")
    String nomeProduto;

    @Column(name = "unidadeDeMedida")
    String unidadeDeMedida;

    @Column(name = "quantidadeProduto")
    double quantidadeProduto;


    public ProdutoDataBase(Produto produto){
        this.idProduto = produto.getIdProduto();
        this.nomeProduto = produto.getNomeProduto();
        this.unidadeDeMedida = produto.getUnidadeDeMedida();
        this.quantidadeProduto = produto.getQuantidadeProduto();
    }

    public Produto newProd() {
        return new Produto(
            this.idProduto,
            this.nomeProduto,
            this.unidadeDeMedida,
            this.quantidadeProduto
        );
    }

}
