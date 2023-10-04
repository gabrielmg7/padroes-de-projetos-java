package com.example.ProjetoExemploFactoryMethod.Model;

import java.util.Date;
import java.util.List;

import com.example.ProjetoExemploFactoryMethod.Enums.StatusPedido;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private StatusPedido status;
    private Date dataPedido;

    // Construtor
    public Pedido(Long id, Cliente cliente, List<ItemPedido> itens, StatusPedido status, Date dataPedido) {
        this.id = id;
        this.cliente = cliente;
        this.itens = itens;
        this.status = status;
        this.dataPedido = dataPedido;
    }

    // Getters e setters (ou métodos para acessar os atributos)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    // Outros métodos relacionados a pedidos

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", itens=" + itens +
                ", status=" + status +
                ", dataPedido=" + dataPedido +
                '}';
    }
}
