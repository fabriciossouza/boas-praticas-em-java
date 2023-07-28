package com.fabriciossouza.financiamento.domain;

public interface ClientFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (valorSolicitado <= 100_000) return 1.0;
        if (valorSolicitado <= 1_000_000) return 1.5;
        return 2.0;
    }

}