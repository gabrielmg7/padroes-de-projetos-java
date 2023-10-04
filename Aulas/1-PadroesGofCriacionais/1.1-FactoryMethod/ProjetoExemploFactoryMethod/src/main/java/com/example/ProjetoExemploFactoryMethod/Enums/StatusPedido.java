package com.example.ProjetoExemploFactoryMethod.Enums;

public enum StatusPedido {
    PENDENTE("Pendente"),
    EM_PROCESSAMENTO("Em Processamento"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue"),
    CANCELADO("Cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
