package com.fabriciossouza.locacao.interfaces.dominio;

import com.fabriciossouza.locacao.dominio.Notebook;
import com.fabriciossouza.locacao.interfaces.dominio.precificacao.Precificacao;
import com.fabriciossouza.locacao.interfaces.dominio.seguro.Seguro;

public class Locacao {

    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public double calcularValorDevido(int horasUtilizadas){
        double valorDevido = precificacao.calcularValorDevido(notebook, horasUtilizadas);

        if(temSeguro())
            valorDevido += seguro.calcularValorPremio(horasUtilizadas, valorDevido);


        return valorDevido;
    };

    public boolean temSeguro() {
        return seguro != null;
    }

    public Seguro getSeguro() {
        return seguro;
    }
}