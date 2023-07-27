package com.fabriciossouza.financiamento.domain.empresarial;

import com.fabriciossouza.financiamento.domain.ClientFinanciavel;

public class LojaVarejista extends Empresa implements ClientFinanciavel {

    private static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.2;
    private static final double PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO = 0.5;

    private double valorTotalEstoque;

    public LojaVarejista(String razaoSocial, double totalFaturamento, double valorTotalEstoque) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalEstoque = valorTotalEstoque;
    }

    public double getValorTotalEstoque() {
        return valorTotalEstoque;
    }

    @Override
    public double calcularLimiteAprovado() {
        return (getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO)
                + (getValorTotalEstoque() * PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO);
    }
}