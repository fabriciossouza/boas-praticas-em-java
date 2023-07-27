package org.example.domain;


public class Industria extends Empresa {

    private boolean compensaEmissaoCo2;

    public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaoCo2) {
        super(razaoSocial, totalFaturamento);
        this.compensaEmissaoCo2 = compensaEmissaoCo2;
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }

}