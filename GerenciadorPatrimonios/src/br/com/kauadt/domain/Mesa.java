package br.com.kauadt.domain;

import br.com.kauadt.enums.FormatoMesa;

import java.util.Date;

public class Mesa extends Movel{
    private FormatoMesa formatoMesa;
    public Mesa(Date dataCadastro, String cor, String laboratorio, int qtdPe, Dimensoes dimensoes, FormatoMesa formatoMesa) {
        super(dataCadastro, cor, laboratorio, qtdPe, dimensoes);
        this.formatoMesa = formatoMesa;
    }

    public FormatoMesa getFormatoMesa() {
        return formatoMesa;
    }

    public void setFormatoMesa(FormatoMesa formatoMesa) {
        this.formatoMesa = formatoMesa;
    }
}
