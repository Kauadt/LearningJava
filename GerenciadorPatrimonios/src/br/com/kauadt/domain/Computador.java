package br.com.kauadt.domain;

import java.util.Date;

public class Computador extends Eletronico{
    private String nome;
    private String processador;
    private String placaDeVideo;
    private String memoriaRam;
    private String armazenamento;
    private String fonte;
    private String placaMae;

    public Computador(Date dataCadastro, String cor, String laboratorio, String marca, String modelo, String nome, String processador, String placaDeVideo, String memoriaRam, String armazenamento, String fonte, String placaMae) {
        super(dataCadastro, cor, laboratorio, marca, modelo);
        this.nome = nome;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.fonte = fonte;
        this.placaMae = placaMae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }
}
