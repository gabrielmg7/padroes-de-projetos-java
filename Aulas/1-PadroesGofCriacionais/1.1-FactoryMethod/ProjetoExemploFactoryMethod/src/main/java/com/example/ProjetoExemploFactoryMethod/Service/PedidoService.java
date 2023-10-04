package com.example.ProjetoExemploFactoryMethod.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProjetoExemploFactoryMethod.Factory.ItemPedidoFactory;
import com.example.ProjetoExemploFactoryMethod.Model.ItemPedido;
import com.example.ProjetoExemploFactoryMethod.Model.Produto;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private List<ItemPedido> pedidos;
    private Long proximoId = 1L; // Para atribuir IDs aos novos pedidos

    public PedidoService() {
        pedidos = new ArrayList<>();
    }

    // Operação de criação de um novo pedido (Create)
    public ItemPedido criarPedido(ItemPedido pedido) {
        pedido.setId(proximoId++);
        pedidos.add(pedido);
        return pedido;
    }

    // Operação para obter todos os pedidos (Read)
    public List<ItemPedido> obterTodosPedidos() {
        return pedidos;
    }

    // Operação para obter um pedido por ID (Read)
    public ItemPedido obterPedidoPorId(Long id) {
        for (ItemPedido pedido : pedidos) {
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null; // Pedido não encontrado
    }

    // Operação de atualização de um pedido por ID (Update)
    public ItemPedido atualizarPedido(Long id, ItemPedido pedidoAtualizado) {
        for (int i = 0; i < pedidos.size(); i++) {
            ItemPedido pedido = pedidos.get(i);
            if (pedido.getId().equals(id)) {
                // Atualiza os detalhes do pedido com os detalhes do pedidoAtualizado
                pedido.setProduto(pedidoAtualizado.getProduto());
                pedido.setQuantidade(pedidoAtualizado.getQuantidade());
                return pedido;
            }
        }
        return null; // Pedido não encontrado
    }

    // Operação de exclusão de um pedido por ID (Delete)
    public void excluirPedido(Long id) {
        pedidos.removeIf(pedido -> pedido.getId().equals(id));
    }
}
