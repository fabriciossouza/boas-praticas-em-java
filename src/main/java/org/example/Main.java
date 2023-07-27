package org.example;

import org.example.domain.Fazenda;
import org.example.domain.Industria;
import org.example.domain.LojaVarejista;
import org.example.service.ServicoFinanciamento;

public class Main {

    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 9_00_000, true);
        var loja = new LojaVarejista("Loja do João", 60_000, 100_000);

        servicoFinanciamento.solicitarFinanciamento(fazenda, 60_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
        servicoFinanciamento.solicitarFinanciamento(loja, 6_000);

    }
}