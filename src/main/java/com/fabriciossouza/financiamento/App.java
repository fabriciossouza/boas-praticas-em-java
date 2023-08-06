package com.fabriciossouza.financiamento;

import com.fabriciossouza.financiamento.domain.empresarial.Fazenda;
import com.fabriciossouza.financiamento.domain.empresarial.Industria;
import com.fabriciossouza.financiamento.domain.empresarial.LojaVarejista;
import com.fabriciossouza.financiamento.domain.pessoal.Funcionario;
import com.fabriciossouza.financiamento.service.ServicoFinanciamento;

public class App {

    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 9_00_000, true);
        var loja = new LojaVarejista("Loja do Fabrício", 60_000, 100_000);
        var funcionario = new Funcionario("João da Silva", 18_000);


        servicoFinanciamento.solicitarFinanciamento(fazenda, 60_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
        servicoFinanciamento.solicitarFinanciamento(loja, 6_000);
        servicoFinanciamento.solicitarFinanciamento(funcionario, 1_000);

    }
}