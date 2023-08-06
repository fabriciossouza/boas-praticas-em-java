package com.fabriciossouza.imposto.dominio;

public class EmpresaLucroReal extends PessoaJuridica {

    private static final int LUCRO_ANUAL_ZERADO = 0;
    private final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }


    @Override
    public double calcularImpostos() {
        double totalLucroAnual = getLucroAnual();
        boolean lucroAnual = totalLucroAnual > 0;

        return lucroAnual ? totalLucroAnual * ALIQUOTA_IMPOSTO_LUCRO
                : LUCRO_ANUAL_ZERADO;
    }
}
