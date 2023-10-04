package com.example.ProjetoExemploFactoryMethod.factory;

import org.springframework.stereotype.Component;

import com.example.ProjetoExemploFactoryMethod.model.ItemPedido;
import com.example.ProjetoExemploFactoryMethod.model.Produto;

@Component
public class ItemPedidoFactoryImpl implements ItemPedidoFactory {

	@Override
	public ItemPedido createItemPedido(Long id, Produto produto, int quantidade, int valorEmCentavos) {
		return null;
	}
}