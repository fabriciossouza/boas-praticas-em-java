package com.fabriciossouza.imposto;


import com.fabriciossouza.imposto.dominio.PessoaFisica;
import com.fabriciossouza.imposto.service.CalculadorDeImpostos;
import com.fabriciossouza.imposto.service.ImpostosFederais;

public class App {

    public static void main(String[] args) {

        var gestorImpostos = new ImpostosFederais();

        var joao = new PessoaFisica("João da Silva", 45_000);
        var maria = new PessoaFisica("Maria Souza", 180_000);

        var calculadorDeImpostos = new CalculadorDeImpostos();
        calculadorDeImpostos.calcularImpostos(gestorImpostos, joao, maria);
    }
}