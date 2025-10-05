package exercicio2.test;

import exercicio2.domain.Bicicleta;

public class BicicletaTest {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.mostrarVelocidade();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.mostrarVelocidade();
        bicicleta.frear();
        bicicleta.frear();
        bicicleta.frear();
        bicicleta.mostrarVelocidade();
        bicicleta.frear();
        bicicleta.frear();
        bicicleta.mostrarVelocidade();

    }
}
