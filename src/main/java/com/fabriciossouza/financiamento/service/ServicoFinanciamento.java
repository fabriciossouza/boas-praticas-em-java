package com.fabriciossouza.financiamento.service;

import com.fabriciossouza.financiamento.domain.ClientFinanciavel;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClientFinanciavel clientFinanciavel, double valorSolicitado) {
        double limiteAprovado = clientFinanciavel.calcularLimiteAprovado();

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado. Limite máximo de %.2f%n", limiteAprovado);
    }

    public double consultarLimiteAprovado(ClientFinanciavel clientFinanciavel) {
        return clientFinanciavel.calcularLimiteAprovado();
    }

}