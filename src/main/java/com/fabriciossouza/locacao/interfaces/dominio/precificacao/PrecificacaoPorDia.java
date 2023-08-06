package com.fabriciossouza.locacao.interfaces.dominio.precificacao;


import com.fabriciossouza.locacao.dominio.Notebook;

public class PrecificacaoPorDia implements Precificacao {


    @Override
    public double calcularValorDevido(Notebook notebook, int horasUtilizadas) {
        double precoPorHora = notebook.getPrecoPorHora();
        return precoPorHora * horasUtilizadas;
    }
}
