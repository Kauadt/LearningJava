package exercicio2.domain;

enum StatusBicicleta {
    ANDANDO,
    PARADA
}

public class Bicicleta {
    private int velocidade = 0;
    private StatusBicicleta status = StatusBicicleta.PARADA;

    public void acelerar() {
        status = StatusBicicleta.ANDANDO;

        velocidade += (int) (velocidade * 0.15) + 10;

        if (velocidade > 50) {
            velocidade = 50;
        }
    }

    public void frear() {
        velocidade -= 5;
        if (velocidade <= 0) {
            velocidade = 0;
            status = StatusBicicleta.PARADA;
        }
    }

    public void mostrarVelocidade() {
        if (status == StatusBicicleta.ANDANDO) {
            System.out.println("A bicicleta está " + status + " a: " + velocidade + " km/h");
        } else {
            System.out.println("A bicicleta está " + status);
        }
    }

}
