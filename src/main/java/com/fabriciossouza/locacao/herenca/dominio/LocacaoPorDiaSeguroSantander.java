
package com.fabriciossouza.locacao.herenca.dominio;


import com.fabriciossouza.locacao.dominio.Notebook;

public class LocacaoPorDiaSeguroSantander extends LocacaoPorDia {

    public LocacaoPorDiaSeguroSantander(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);
        valorTotal += (horasUtilizadas * 0.5) + (valorTotal * 0.05);
        return valorTotal;
    }

}