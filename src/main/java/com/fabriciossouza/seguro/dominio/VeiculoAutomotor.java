package com.fabriciossouza.seguro.dominio;

public abstract class VeiculoAutomotor extends Veiculo implements BemSeguravel {

    private double valorMercado;

    public VeiculoAutomotor(String modelo, int anoFabricacao, double valorMercado) {
        super(modelo, anoFabricacao);
        this.valorMercado = valorMercado;
    }

    public double getValorMercado() {
        return valorMercado;
    }
}