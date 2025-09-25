package br.com.kauadt.domain;

import br.com.kauadt.enums.TipoCadeira;

import java.util.Date;

public class Cadeira extends Movel {
    private TipoCadeira tipo;

    public Cadeira(Date dataCadastro, String cor, String laboratorio, int qtdPe, Dimensoes dimensoes, TipoCadeira tipo) {
        super(dataCadastro, cor, laboratorio, qtdPe, dimensoes);
        this.tipo = tipo;
    }
}
