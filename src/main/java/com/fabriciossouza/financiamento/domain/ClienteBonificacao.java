package com.fabriciossouza.financiamento.domain;

public interface ClienteBonificacao extends ClienteFinanciavel {


    double calcularBonus(double percentua);

}