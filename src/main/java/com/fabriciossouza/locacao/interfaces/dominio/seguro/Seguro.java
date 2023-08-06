package com.fabriciossouza.locacao.interfaces.dominio.seguro;


public interface Seguro {

    double calcularValorPremio(int horasUtilizadas, double valorContratado);
}
