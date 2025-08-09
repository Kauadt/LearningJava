package com.kauadt.javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int qtdEp;
    private String genero;
    public String estudio;


    public Anime(String nome, String tipo, int qtdEp, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.qtdEp = qtdEp;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int qtdEp, String genero, String estudio){
        this(nome, tipo, qtdEp, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.qtdEp);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setQtdEp(int qtdEp) {
        this.qtdEp = qtdEp;
    }

    public int getQtdEp() {
        return this.qtdEp;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
