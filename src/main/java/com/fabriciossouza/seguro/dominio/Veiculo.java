package com.fabriciossouza.seguro.dominio;

public abstract class Veiculo {

    private String modelo;
    private int anoFabricacao;

    public Veiculo(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}