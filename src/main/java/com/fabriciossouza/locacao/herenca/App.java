package com.fabriciossouza.locacao.herenca;


import com.fabriciossouza.locacao.herenca.dominio.Locacao;
import com.fabriciossouza.locacao.herenca.dominio.LocacaoPorDiaSeguroItau;
import com.fabriciossouza.locacao.dominio.Notebook;

public class App {

    public static void main(String[] args) {
        Notebook notebook = new Notebook("Macbook Pro i7 16gb", 5, 100);

        Locacao locacao = new LocacaoPorDiaSeguroItau(notebook);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
    }
}