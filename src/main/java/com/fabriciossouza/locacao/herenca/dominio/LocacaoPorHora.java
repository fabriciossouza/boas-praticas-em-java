
package com.fabriciossouza.locacao.herenca.dominio;

import com.fabriciossouza.locacao.dominio.Notebook;

public  class LocacaoPorHora extends Locacao {

    public LocacaoPorHora(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return getNotebook().getPrecoPorDia() * dias;
    }
}

