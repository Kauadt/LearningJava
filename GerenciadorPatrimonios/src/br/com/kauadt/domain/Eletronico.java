package br.com.kauadt.domain;

import java.util.Date;

public class Eletronico extends Patrimonio {
    private String marca;
    private String modelo;

    public Eletronico(Date dataCadastro, String cor, String laboratorio, String marca, String modelo) {
        super(dataCadastro, cor, laboratorio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
