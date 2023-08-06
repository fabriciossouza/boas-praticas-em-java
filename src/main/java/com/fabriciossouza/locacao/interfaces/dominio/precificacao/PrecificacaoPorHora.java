package com.fabriciossouza.locacao.interfaces.dominio.precificacao;


import com.fabriciossouza.locacao.dominio.Notebook;

public class PrecificacaoPorHora implements Precificacao {


    @Override
    public double calcularValorDevido(Notebook notebook, int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return notebook.getPrecoPorDia() * dias;
    }
}
