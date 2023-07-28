package com.fabriciossouza.financiamento.domain;

public interface ClienteFinanciavel {

    int EMPRESA_VALOR_SIMPLES_NACIONAL = 1_000_000;
    int EMPRESA_VALOR_MEI = 100_000;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoMedioValor(valorSolicitado)) return 1.0;
        if (isFinanciamentoGrandeValor(valorSolicitado)) return 1.5;
        return 2.0;
    }

    private boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= EMPRESA_VALOR_SIMPLES_NACIONAL;
    }

    private boolean isFinanciamentoMedioValor(double valorSolicitado) {
        return valorSolicitado <= EMPRESA_VALOR_MEI;
    }

}