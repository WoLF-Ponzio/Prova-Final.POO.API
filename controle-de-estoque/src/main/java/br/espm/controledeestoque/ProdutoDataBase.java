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

    @Column(name = "marcaProduto")
    String marcaProduto;

    @Column(name = "unidadeDeMedida")
    String unidadeDeMedida;

    @Column(name = "quantidadeProduto")
    double quantidadeProduto;

    @Column(name = "descProduto")
    String descProduto;


    public ProdutoDataBase(Produto produto){
        this.idProduto = produto.getIdProduto();
        this.nomeProduto = produto.getNomeProduto();
        this.marcaProduto = produto.getMarcaProduto();
        this.unidadeDeMedida = produto.getUnidadeDeMedida();
        this.quantidadeProduto = produto.getQuantidadeProduto();
        this.descProduto = produto.getDescProduto();
    }

    public Produto newProd() {
        return new Produto(
            this.idProduto,
            this.nomeProduto,
            this.marcaProduto,
            this.unidadeDeMedida,
            this.quantidadeProduto,
            this.descProduto
        );
    }

}
