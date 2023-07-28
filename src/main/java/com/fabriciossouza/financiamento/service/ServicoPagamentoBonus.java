package com.fabriciossouza.financiamento.service;

import com.fabriciossouza.financiamento.domain.ClienteBonificacao;

import static java.lang.System.out;


public class ServicoPagamentoBonus {

    public void pagar(ClienteBonificacao cliente, double percentualParaBonificacao) {
        double valorBonus = cliente.calcularBonus(percentualParaBonificacao);

        out.printf("DEBUG: Bônus pago no valor de %.2f", valorBonus);
    }

}