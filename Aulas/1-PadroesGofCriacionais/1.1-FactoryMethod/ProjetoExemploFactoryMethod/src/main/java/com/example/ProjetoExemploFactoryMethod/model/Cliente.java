package com.example.ProjetoExemploFactoryMethod.model;

public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;

    // Construtor
    public Cliente(Long id, String nome, String email, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e setters (ou métodos para acessar os atributos)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Outros métodos relacionados a clientes

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
