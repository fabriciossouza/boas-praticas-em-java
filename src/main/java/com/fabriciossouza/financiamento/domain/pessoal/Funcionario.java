package com.fabriciossouza.financiamento.domain.pessoal;

import com.fabriciossouza.financiamento.domain.ClienteFinanciavel;

public class Funcionario extends Pessoa implements ClienteFinanciavel {

    private static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;

    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }
}
