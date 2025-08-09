package com.kauadt.javacore.Gassociacao.test;

import com.kauadt.javacore.Gassociacao.domain.Escola;
import com.kauadt.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("João");
        Professor[] professores = {professor};
        Escola escola = new Escola("ETEC", professores);
        escola.imprime();

    }
}
