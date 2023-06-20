package br.espm.controledeestoque;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServices {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto geProduto(String id){
        List <Produto> lista = produtoRepository.findAll();
        for (Produto produto : lista) {
            if(produto.getIdProduto().equals(id)){
                Produto produtoEncontrado = new Produto();
                produtoEncontrado.setIdProduto(produto.getIdProduto());
                produtoEncontrado.setNomeProduto(produto.getNomeProduto());
                produtoEncontrado.setMarcaProduto(produto.getMarcaProduto());
                produtoEncontrado.setQuantidadeProduto(produto.getQuantidadeProduto());
                produtoEncontrado.setUnidadeDeMedida(produto.getUnidadeDeMedida());
                produtoEncontrado.setDescProduto(produto.getDescProduto());
                return produtoEncontrado;
            }
        }
        return null;
    }

    public void cadastrarProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public void atualizarProduto(Produto produto, String id){
        produtoRepository.findById(id).map(produtoAntigo -> {
            produtoAntigo.setNomeProduto(produto.getNomeProduto());
            produtoAntigo.setMarcaProduto(produto.getMarcaProduto());
            produtoAntigo.setQuantidadeProduto(produto.getQuantidadeProduto());
            produtoAntigo.setUnidadeDeMedida(produto.getUnidadeDeMedida());
            produtoAntigo.setDescProduto(produto.getDescProduto());
            return produtoRepository.save(produtoAntigo);
        });
    }

    public void deletarProduto(String id){
        produtoRepository.deleteById(id); 
    }

}
