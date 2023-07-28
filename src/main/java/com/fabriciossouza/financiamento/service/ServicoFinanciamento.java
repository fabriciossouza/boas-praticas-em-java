package com.fabriciossouza.financiamento.service;

import com.fabriciossouza.financiamento.domain.ClientFinanciavel;

import static java.lang.System.out;


public class ServicoFinanciamento {

    private static final String LOG_FINANCIAMENTO_APROVADO = "Financiamento aprovado no valor de R$%.2f com juros de %.2f%%. Limite máximo de %.2f%n";

    public void solicitarFinanciamento(ClientFinanciavel clientFinanciavel, double valorSolicitado) {
        double limiteAprovado = clientFinanciavel.calcularLimiteAprovado();
        double juros = clientFinanciavel.calcularJuros(valorSolicitado);

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        out.printf("DEBUG: ".concat(LOG_FINANCIAMENTO_APROVADO), valorSolicitado, juros, limiteAprovado);;
    }

    public double consultarLimiteAprovado(ClientFinanciavel clientFinanciavel) {
        return clientFinanciavel.calcularLimiteAprovado();
    }

}