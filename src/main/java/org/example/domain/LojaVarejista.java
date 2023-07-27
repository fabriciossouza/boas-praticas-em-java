package org.example.domain;

public class LojaVarejista extends Empresa {

    public LojaVarejista(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }
}