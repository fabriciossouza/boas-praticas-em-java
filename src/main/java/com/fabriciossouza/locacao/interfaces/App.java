package com.fabriciossouza.locacao.interfaces;


import com.fabriciossouza.locacao.dominio.Notebook;
import com.fabriciossouza.locacao.interfaces.dominio.Locacao;
import com.fabriciossouza.locacao.interfaces.dominio.precificacao.Precificacao;
import com.fabriciossouza.locacao.interfaces.dominio.precificacao.PrecificacaoPorHora;
import com.fabriciossouza.locacao.interfaces.dominio.seguro.Seguro;
import com.fabriciossouza.locacao.interfaces.dominio.seguro.SeguroSantander;

public class App {

    public static void main(String[] args) {
        Notebook notebook = new Notebook("Macbook Pro i7 16gb", 5, 100);
        Precificacao precificacao = new PrecificacaoPorHora();
        //Precificacao precificacao = new PrecificacaoPorDia();
        Seguro seguro = new SeguroSantander();

        Locacao locacao = new Locacao(notebook, precificacao, seguro);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }
}