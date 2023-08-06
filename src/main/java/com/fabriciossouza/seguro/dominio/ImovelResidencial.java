package com.fabriciossouza.seguro.dominio;

public class ImovelResidencial extends Imovel implements BemSeguravel {

    private double valorMercado;

    public ImovelResidencial(int areaConstruida, double valorMercado) {
        super(areaConstruida);
        this.valorMercado = valorMercado;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.001;
        valorPremio += getAreaConstruida() * 0.3;

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f",
                getAreaConstruida(),
                getValorMercado());
    }

    public double getValorMercado() {
        return valorMercado;
    }
}
