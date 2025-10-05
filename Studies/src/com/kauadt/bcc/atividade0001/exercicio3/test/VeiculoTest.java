package exercicio3.test;

import exercicio3.domain.Carro;
import exercicio3.domain.Moto;

public class VeiculoTest {
    public static void main(String[] args) {
        Moto moto = new Moto(50, 0.1, true, 600);
        moto.mostrarDistanciaPercorrida();
        moto.andar(-1);
        moto.andar(45);
        moto.andar(100.5);
        moto.mostrarDistanciaPercorrida();
        moto.mostrarAutonomia();

        Carro carro = new Carro(110, .3, 4, 500);
        carro.mostrarAutonomia();
        carro.andar(50);
        carro.mostrarDistanciaPercorrida();
    }

}