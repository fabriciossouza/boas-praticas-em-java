package com.fabriciossouza.seguro.service;

import com.fabriciossouza.seguro.dominio.BemSeguravel;

import static java.util.Arrays.stream;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem){
        System.out.println("----------------------");
        System.out.println("Proposta de seguro");
        System.out.println("----------------------");
        System.out.println(bem.descrever());
        System.out.printf("Prêmio: R$%.2f%n", bem.calcularValorPremio());
    }


    public void emitir(BemSeguravel... bens){
        stream(bens).forEach(this::emitir);
    }
}
