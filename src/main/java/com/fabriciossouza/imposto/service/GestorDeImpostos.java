package com.fabriciossouza.imposto.service;

import com.fabriciossouza.imposto.dominio.Pessoa;

public interface GestorDeImpostos {

    void adicionar(Pessoa pessoa);

    double getValorTotalImpostos();

}
