package com.fabriciossouza.locacao.interfaces.dominio.precificacao;


import com.fabriciossouza.locacao.dominio.Notebook;

public interface Precificacao {

    double calcularValorDevido(Notebook notebook, int horasUtilizadas);
}
