package br.com.kauadt.domain;

import java.util.Date;

public class Patrimonio {
    private static Long idCounter = 0L;

    private Long id;
    private Date dataCadastro;
    private String cor;
    private String laboratorio;


    public Patrimonio(Date dataCadastro, String cor, String laboratorio) {
        this.id = idCounter++;
        this.dataCadastro = dataCadastro;
        this.cor = cor;
        this.laboratorio = laboratorio;
    }

    public Long getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
}
