package com.kauadt.javacore.Lclassesabstratas.test;

import com.kauadt.javacore.Lclassesabstratas.domain.Desenvolvedor;
import com.kauadt.javacore.Lclassesabstratas.domain.Funcionario;
import com.kauadt.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
