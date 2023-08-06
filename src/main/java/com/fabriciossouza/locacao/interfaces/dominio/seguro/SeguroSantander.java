package com.fabriciossouza.locacao.interfaces.dominio.seguro;


public class SeguroSantander implements Seguro {

    public double calcularValorPremio(int horasUtilizadas, double valorTotal) {
        return  (horasUtilizadas * 0.5) + (valorTotal * 0.05);
    }
}
