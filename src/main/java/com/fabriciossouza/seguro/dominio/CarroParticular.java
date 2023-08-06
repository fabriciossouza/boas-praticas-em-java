package com.fabriciossouza.seguro.dominio;

public class CarroParticular extends VeiculoAutomotor {

    private static final int ANO_FABRICACAO = 2000;
    private static final double VALOR_PREMIO = 1.05;
    private static final double PORCENTAGEM_PREMIO = 0.04;

    public CarroParticular(String modelo, int anoFabricacao, double valorMercado) {
        super(modelo, anoFabricacao, valorMercado);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * PORCENTAGEM_PREMIO;

        if (getAnoFabricacao() < ANO_FABRICACAO) {
            valorPremio *= VALOR_PREMIO;
        }

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular %s ano %d, avaliado em R$%.2f",
                getModelo(),
                getAnoFabricacao(),
                getValorMercado());
    }
}
