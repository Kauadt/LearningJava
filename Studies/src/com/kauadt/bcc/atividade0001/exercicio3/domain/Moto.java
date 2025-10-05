package exercicio3.domain;

public class Moto extends Veiculo {
    private boolean carenagem;
    private int cilindradas;

    public Moto(double capacidade, double consumo, boolean carenagem, int cilindradas) {
        super(capacidade, consumo);
        this.carenagem = carenagem;
        this.cilindradas = cilindradas;
    }
}
