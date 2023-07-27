package com.fabriciossouza.financiamento.domain.pessoal;

public abstract class Pessoa {

    protected String nome;
    protected String cpf;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}
