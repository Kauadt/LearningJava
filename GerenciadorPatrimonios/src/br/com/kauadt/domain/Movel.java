package br.com.kauadt.domain;

import java.util.Date;

public class Movel extends Patrimonio {
    private int qtdPe;
    private Dimensoes dimensoes;

    public Movel(Date dataCadastro, String cor, String laboratorio, int qtdPe, Dimensoes dimensoes) {
        super(dataCadastro, cor, laboratorio);
        this.qtdPe = qtdPe;
        this.dimensoes = dimensoes;
    }

    public int getQtdPe() {
        return qtdPe;
    }

    public void setQtdPe(int qtdPe) {
        this.qtdPe = qtdPe;
    }

    public Dimensoes getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(Dimensoes dimensoes) {
        this.dimensoes = dimensoes;
    }
}
