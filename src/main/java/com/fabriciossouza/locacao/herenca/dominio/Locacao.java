package com.fabriciossouza.locacao.herenca.dominio;

import com.fabriciossouza.locacao.dominio.Notebook;

public abstract class Locacao {

    private Notebook notebook;

    public Locacao(Notebook notebook) {
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public abstract double calcularValorDevido(int horasUtilizadas);
}


