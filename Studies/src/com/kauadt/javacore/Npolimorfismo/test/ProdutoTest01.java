package com.kauadt.javacore.Npolimorfismo.test;

import com.kauadt.javacore.Npolimorfismo.domain.Computador;
import com.kauadt.javacore.Npolimorfismo.domain.Televisao;
import com.kauadt.javacore.Npolimorfismo.domain.Tomate;
import com.kauadt.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
