package domain;

public class Contador {

    private Long contador;

    public Contador() {
        this.contador = 0L;
    }

    public Contador(Long qtd) {
        this.contador = qtd;
    }

    public void zerar() {
        this.contador = 0L;
    }

    public void incrementar() {
        this.contador += 1L;
    }

    public void incrementar(Long qtd) {
        this.contador += qtd;
    }

    public void decrementar() {
        this.contador -= 1L;
    }

    public void decrementar(Long qtd) {
        this.contador -= qtd;
    }

    public Long getContador() {
        return this.contador;
    }
}
