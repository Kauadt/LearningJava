package com.kauadt.javacore.Bintroducaometodos.test;

import com.kauadt.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
    }
}
