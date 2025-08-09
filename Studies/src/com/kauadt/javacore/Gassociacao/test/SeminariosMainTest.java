package com.kauadt.javacore.Gassociacao.test;

import com.kauadt.javacore.Gassociacao.domain.Aluno;
import com.kauadt.javacore.Gassociacao.domain.Local;
import com.kauadt.javacore.Gassociacao.domain.Professor;
import com.kauadt.javacore.Gassociacao.domain.Seminario;

public class SeminariosMainTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();


    }
}
