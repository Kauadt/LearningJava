package exercicio3.domain;

public class Carro extends Veiculo {
    private final int QTD_PORTAS;
    private final double CAPACIDADE_PORTA_MALAS;

    public Carro(double capacidade, double consumo, int qtdPortas, double capacidadePortaMalas) {
        super(capacidade, consumo);
        this.QTD_PORTAS = qtdPortas;
        this.CAPACIDADE_PORTA_MALAS = capacidadePortaMalas;
    }
}
