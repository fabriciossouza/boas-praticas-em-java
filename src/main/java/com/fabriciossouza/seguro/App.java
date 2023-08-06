package com.fabriciossouza.seguro;


import com.fabriciossouza.seguro.dominio.Caminhao;
import com.fabriciossouza.seguro.dominio.CarroParticular;
import com.fabriciossouza.seguro.dominio.ImovelResidencial;
import com.fabriciossouza.seguro.service.ServicoPropostaSeguro;

public class App {

    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        var carro = new CarroParticular("HR-V", 2022, 150_000);
        var caminhao = new Caminhao("Actros", 2021, 780_000, 4);
        var imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro, caminhao, imovel);
    }
}