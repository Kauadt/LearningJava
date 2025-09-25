package com.kauadt.javacore.Npolimorfismo.test;

import com.kauadt.javacore.Npolimorfismo.domain.Computador;
import com.kauadt.javacore.Npolimorfismo.domain.Produto;
import com.kauadt.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
    }
}
