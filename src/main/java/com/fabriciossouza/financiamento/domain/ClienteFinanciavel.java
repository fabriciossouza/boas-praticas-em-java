package com.fabriciossouza.financiamento.domain;

public interface ClienteFinanciavel {

    int EMPRESA_VALOR_SIMPLES_NACIONAL = 1_000_000;
    int EMPRESA_VALOR_MEI = 100_000;

    double JUROS_RISCO_BAIXO = 1.0;
    double JUROS_RISCO_MEDIO = 1.5;
    double JUROS_RISCO_ALTO = 2.0;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoMedioValor(valorSolicitado)) return JUROS_RISCO_BAIXO;
        if (isFinanciamentoGrandeValor(valorSolicitado)) return JUROS_RISCO_MEDIO;
        return JUROS_RISCO_ALTO;
    }

    private boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= EMPRESA_VALOR_SIMPLES_NACIONAL;
    }

    private boolean isFinanciamentoMedioValor(double valorSolicitado) {
        return valorSolicitado <= EMPRESA_VALOR_MEI;
    }

}