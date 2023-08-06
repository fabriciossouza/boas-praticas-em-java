package com.fabriciossouza.seguro.dominio;

public abstract class Imovel  {

    private int areaConstruida;

    public Imovel(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }
}
