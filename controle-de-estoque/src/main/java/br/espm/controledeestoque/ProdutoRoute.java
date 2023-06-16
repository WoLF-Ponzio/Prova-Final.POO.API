package br.espm.controledeestoque;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}