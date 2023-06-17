package br.espm.controledeestoque;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/estoque")
public class ProdutoRoute {
    
    @Autowired
    private ProdutoServices produtoServices;

    @GetMapping("/produtos")
    public List<Produto> listarProdutos(){
    return produtoServices.listarProdutos();
    }

    @PostMapping("/cadastrar-produto")
    public void cadastrarProduto(@RequestBody Produto produto ){
        produtoServices.cadastrarProduto(produto);
    }

    @PutMapping("/atualizar-produto/{id}")
        public void atualizarProduto(@RequestBody Produto produto, @PathVariable String id){
            produtoServices.atualizarProduto(produto, id);
    }

    @DeleteMapping("/deletar-produto/{id}")
        public void deletarProduto(@PathVariable ("id") String id){
            produtoServices.deletarProduto(id);
        }

}