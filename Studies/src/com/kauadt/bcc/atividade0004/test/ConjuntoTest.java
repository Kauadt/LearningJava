package test;

import java.util.Arrays;
import java.util.HashSet;
import domain.Conjunto;

public class ConjuntoTest {

    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Conjunto conjunto2 = new Conjunto(new HashSet<>(Arrays.asList(1, 4, 5, 6, 7, 8, 9)));

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);

        conjunto1.diferenca(conjunto2);
        System.out.println("Conjunto1 - Conjunto2: " + conjunto1);

        conjunto1.uniao(conjunto2);
        System.out.println("Conjunto1 U Conjunto2: " + conjunto1);

        conjunto1.interseccao(conjunto2);
        System.out.println("Conjunto1 ∩ Conjunto2: " + conjunto1);

    }

}