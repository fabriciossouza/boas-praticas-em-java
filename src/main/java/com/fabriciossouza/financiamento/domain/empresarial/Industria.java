package com.fabriciossouza.financiamento.domain.empresarial;


public class Industria extends EmpresaFinanciavel {

    private static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    private static final double TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL = 1.2;

    private boolean compensaEmissaoCo2;

    public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaoCo2) {
        super(razaoSocial, totalFaturamento);
        this.compensaEmissaoCo2 = compensaEmissaoCo2;
    }

    public boolean isCompensaEmissaoCo2() {
        return compensaEmissaoCo2;
    }

    @Override
    public double calcularLimiteAprovado() {
        double valorAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

        if (isCompensaEmissaoCo2()) {
            valorAprovado *= TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL;
        }

        return valorAprovado;
    }

}