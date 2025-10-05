package test;

import domain.Contador;

public class ContadorTest {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador(20L);

        System.out.println("Contador 1: " + contador1.getContador());
        System.out.println("Contador 2: " + contador2.getContador());
        contador1.decrementar();
        contador1.incrementar(60L);

        contador2.decrementar(1L);

        System.out.println("Contador 1 após operações: " + contador1.getContador());
        System.out.println("Contador 2 após operações: " + contador2.getContador());

    }
}
