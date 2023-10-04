package com.example.ProjetoExemploFactoryMethod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ProjetoExemploFactoryMethod.model.ItemPedido;
import com.example.ProjetoExemploFactoryMethod.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    // Endpoint para criar um novo pedido (Create)
    @PostMapping
    public ItemPedido criarPedido(@RequestBody ItemPedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    // Endpoint para obter todos os pedidos (Read)
    @GetMapping
    public List<ItemPedido> obterTodosPedidos() {
        return pedidoService.obterTodosPedidos();
    }

    // Endpoint para obter um pedido por ID (Read)
    @GetMapping("/{id}")
    public ItemPedido obterPedidoPorId(@PathVariable Long id) {
        return pedidoService.obterPedidoPorId(id);
    }

    // Endpoint para atualizar um pedido por ID (Update)
    @PutMapping("/{id}")
    public ItemPedido atualizarPedido(@PathVariable Long id, @RequestBody ItemPedido pedidoAtualizado) {
        return pedidoService.atualizarPedido(id, pedidoAtualizado);
    }

    // Endpoint para excluir um pedido por ID (Delete)
    @DeleteMapping("/{id}")
    public void excluirPedido(@PathVariable Long id) {
        pedidoService.excluirPedido(id);
    }
}