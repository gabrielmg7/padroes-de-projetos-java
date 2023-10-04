package com.example.ProjetoExemploFactoryMethod.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ProjetoExemploFactoryMethod.Model.Produto;
import com.example.ProjetoExemploFactoryMethod.Service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Endpoint para criar um novo produto (Create)
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.criarProduto(produto);
    }

    // Endpoint para obter todos os produtos (Read)
    @GetMapping
    public List<Produto> obterTodosProdutos() {
        return produtoService.obterTodosProdutos();
    }

    // Endpoint para obter um produto por ID (Read)
    @GetMapping("/{id}")
    public Produto obterProdutoPorId(@PathVariable Long id) {
        return produtoService.obterProdutoPorId(id);
    }

    // Endpoint para atualizar um produto por ID (Update)
    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.atualizarProduto(id, produto);
    }

    // Endpoint para excluir um produto por ID (Delete)
    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Long id) {
        produtoService.excluirProduto(id);
    }
}