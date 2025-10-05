package exercicio3.domain;

public abstract class Veiculo {

    private final double CAPACIDADE_RESERVATORIO_COMBUSTIVEL;
    private final double CONSUMO_COMBUSTIVEL;
    private int distanciaTotalPercorrida = 0;

    public Veiculo(double capacidade, double consumo) {
        this.CAPACIDADE_RESERVATORIO_COMBUSTIVEL = capacidade;
        this.CONSUMO_COMBUSTIVEL = consumo;
    }

    public void mostrarAutonomia() {
        System.out.println(CAPACIDADE_RESERVATORIO_COMBUSTIVEL / CONSUMO_COMBUSTIVEL);
    }

    public void andar(double distancia) {
        if (distancia <= 0) {
            System.out.println("Por favor, informe uma distância válida!");
        }
        this.distanciaTotalPercorrida += distancia;
    }

    public void mostrarDistanciaPercorrida() {
        System.out.println("O veículo possui " + this.distanciaTotalPercorrida + "KM percorridos");
    }

}
