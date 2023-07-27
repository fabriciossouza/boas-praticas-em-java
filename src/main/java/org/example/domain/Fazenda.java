package org.example.domain;

public class Fazenda extends Empresa {

    public Fazenda(String razaoSocial, double totalFaturamento, int i) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }

}


