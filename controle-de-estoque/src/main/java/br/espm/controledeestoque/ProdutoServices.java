package br.espm.controledeestoque;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Id;

@Service
public class ProdutoServices {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public void cadastrarProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public void atualizarProduto(Produto produto, String id){
        produtoRepository.findById(id).map(produtoAntigo -> {
            produtoAntigo.setNomeProduto(produto.getNomeProduto());
            produtoAntigo.setQuantidadeProduto(produto.getQuantidadeProduto());
            return produtoRepository.save(produtoAntigo);
        });
    }

}
