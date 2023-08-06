package com.fabriciossouza.locacao.interfaces.dominio.seguro;


public class SeguroItau implements Seguro {

    public double calcularValorPremio(int horasUtilizadas, double valorTotal) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return dias * 5;
    }
}
