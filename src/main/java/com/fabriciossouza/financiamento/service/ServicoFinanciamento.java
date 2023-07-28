package com.fabriciossouza.financiamento.service;

import com.fabriciossouza.financiamento.domain.ClienteFinanciavel;

import static java.lang.String.format;
import static java.lang.System.out;


public class ServicoFinanciamento {

    private static final String LOG_FINANCIAMENTO_APROVADO = "Financiamento aprovado no valor de R$ %.2f com juros de %.2f%%. Limite máximo de %.2f%n";

    public void solicitarFinanciamento(ClienteFinanciavel clienteFinanciavel, double valorSolicitado) {
        double limiteAprovado = clienteFinanciavel.calcularLimiteAprovado();
        double juros = clienteFinanciavel.calcularJuros(valorSolicitado);

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(format("Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        out.printf("DEBUG: ".concat(LOG_FINANCIAMENTO_APROVADO), valorSolicitado, juros, limiteAprovado);;
    }

    public double consultarLimiteAprovado(ClienteFinanciavel clienteFinanciavel) {
        return clienteFinanciavel.calcularLimiteAprovado();
    }

}