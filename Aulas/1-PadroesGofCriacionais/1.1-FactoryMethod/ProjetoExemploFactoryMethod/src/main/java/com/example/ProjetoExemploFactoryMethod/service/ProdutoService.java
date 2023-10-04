package com.example.ProjetoExemploFactoryMethod.service;

import org.springframework.stereotype.Service;

import com.example.ProjetoExemploFactoryMethod.model.Produto;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private List<Produto> produtos;
    private Long proximoId = 1L; // Para atribuir IDs aos novos produtos

    public ProdutoService() {
        produtos = new ArrayList<>();
    }

    // Operação de criação de um novo produto (Create)
    public Produto criarProduto(Produto produto) {
        produto.setId(proximoId++);
        produtos.add(produto);
        return produto;
    }

    // Operação para obter todos os produtos (Read)
    public List<Produto> obterTodosProdutos() {
        return produtos;
    }

    // Operação para obter um produto por ID (Read)
    public Produto obterProdutoPorId(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null; // Produto não encontrado
    }

    // Operação de atualização de um produto por ID (Update)
    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getId().equals(id)) {
                // Atualiza os dados do produto com os dados do produtoAtualizado
                produto.setNome(produtoAtualizado.getNome());
                produto.setDescricao(produtoAtualizado.getDescricao());
                produto.setPreco(produtoAtualizado.getPreco());
                return produto;
            }
        }
        return null; // Produto não encontrado
    }

    // Operação de exclusão de um produto por ID (Delete)
    public void excluirProduto(Long id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }
}
