package com.fabriciossouza.locacao.dominio;

public class Notebook {

    private String descricao;
    private double precoPorHora;
    private double precoPorDia;

    public Notebook(String descricao, double precoPorHora, double precoPorDia) {
        this.descricao = descricao;
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }
}
