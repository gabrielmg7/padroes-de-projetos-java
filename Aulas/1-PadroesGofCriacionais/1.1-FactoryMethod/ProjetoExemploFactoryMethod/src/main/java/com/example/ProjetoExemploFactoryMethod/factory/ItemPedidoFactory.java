package com.example.ProjetoExemploFactoryMethod.Factory;

import com.example.ProjetoExemploFactoryMethod.Model.ItemPedido;
import com.example.ProjetoExemploFactoryMethod.Model.Produto;

public interface ItemPedidoFactory {
	ItemPedido createItemPedido(Long id, Produto produto, int quantidade, int valorEmCentavos);
}