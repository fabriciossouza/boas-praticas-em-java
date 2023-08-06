package com.fabriciossouza.imposto.service;


import com.fabriciossouza.imposto.dominio.Pessoa;

import static java.util.Arrays.stream;

public class CalculadorDeImpostos {

    public void calcularImpostos(GestorDeImpostos gestorDeImpostos, Pessoa... pessoas) {
        stream(pessoas).forEach(gestorDeImpostos::adicionar);
        System.out.printf("Total de impostos: %.2f", gestorDeImpostos.getValorTotalImpostos());
    }
}