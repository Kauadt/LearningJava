package test;

import domain.Ponto2D;

public class Ponto2DTest {
    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D(10, 20);
        Ponto2D outroPonto = new Ponto2D(20, 20);
        System.out.println(ponto.equals(outroPonto));
        ponto.mostrarDistancia(50, 20);
        ponto.mostrarDistancia(outroPonto);
        System.out.println(ponto);
        outroPonto.moverPonto(ponto);
        System.out.println(ponto.equals(outroPonto));
    }
}
