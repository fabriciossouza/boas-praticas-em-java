package org.example;

import org.example.domain.Fazenda;
import org.example.domain.Industria;
import org.example.service.ServicoFinanciamento;

public class Main {
    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);

        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 600_000);

    }
}