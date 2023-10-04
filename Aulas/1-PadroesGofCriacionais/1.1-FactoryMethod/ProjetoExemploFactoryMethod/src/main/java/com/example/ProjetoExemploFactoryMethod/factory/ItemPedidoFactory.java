package com.example.ProjetoExemploFactoryMethod.factory;

import com.example.ProjetoExemploFactoryMethod.model.ItemPedido;
import com.example.ProjetoExemploFactoryMethod.model.Produto;

public interface ItemPedidoFactory {
	ItemPedido createItemPedido(Long id, Produto produto, int quantidade, int valorEmCentavos);
}