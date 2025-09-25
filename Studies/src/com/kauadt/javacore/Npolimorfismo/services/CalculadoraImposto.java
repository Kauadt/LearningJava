package com.kauadt.javacore.Npolimorfismo.services;

import com.kauadt.javacore.Npolimorfismo.domain.Computador;
import com.kauadt.javacore.Npolimorfismo.domain.Produto;
import com.kauadt.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
            // System.out.println(((Tomate)produto).getDataValidade());
        }

    }
}
