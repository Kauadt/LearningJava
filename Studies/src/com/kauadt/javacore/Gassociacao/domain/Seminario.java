package com.kauadt.javacore.Gassociacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.local = local;
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println(this.titulo);
        System.out.println(this.local.getEndereco());
        if(alunos.length == 0) return;
        for (Aluno aluno : alunos) {
            System.out.print(aluno + " ");
        }
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
