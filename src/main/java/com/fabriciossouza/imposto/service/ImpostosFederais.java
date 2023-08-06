package com.fabriciossouza.imposto.service;

import com.fabriciossouza.imposto.dominio.Pessoa;

public class ImpostosFederais implements GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        double valorTotalImpostoCalculado = pessoa.calcularImpostos();

        System.out.printf("Impostos federais devidos de %s: %.2f%n", pessoa.getNome(), valorTotalImpostoCalculado);

        valorTotalImpostos += valorTotalImpostoCalculado;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
