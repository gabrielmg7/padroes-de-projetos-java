package com.example.ProjetoExemploFactoryMethod.Factory;

import org.springframework.stereotype.Component;
import com.example.ProjetoExemploFactoryMethod.Model.ItemPedido;
import com.example.ProjetoExemploFactoryMethod.Model.Produto;

@Component
public class ItemPedidoFactoryImpl implements ItemPedidoFactory {

	@Override
	public ItemPedido createItemPedido(Long id, Produto produto, int quantidade, int valorEmCentavos) {
		return null;
	}
}