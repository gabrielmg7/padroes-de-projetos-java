package com.example.ProjetoExemploFactoryMethod.model;

import java.util.List;

public class ItemPedido {
    private Long id;
    private Produto produto;
    private int quantidade;
    private double precoUnitario;
    private double subtotal;


    // Construtor
    public ItemPedido(Long id, Produto produto, int quantidade, double precoUnitario) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.subtotal = quantidade * precoUnitario;
    }


    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}


	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	@Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", subtotal=" + subtotal +
                '}';
    }
}