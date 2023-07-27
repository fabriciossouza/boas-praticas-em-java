package com.fabriciossouza.financiamento.domain.empresarial;

public abstract class Empresa {

    protected String razaoSocial;
    protected String cnpj;
    protected double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        this.razaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

}