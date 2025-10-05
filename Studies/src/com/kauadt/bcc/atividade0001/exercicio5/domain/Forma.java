package exercicio5.domain;

public abstract class Forma {
    private static Long qtdFormasCriadas = 0L;

    public Forma() {
        qtdFormasCriadas += 1L;
    }

    public abstract void calcularArea();

    public static void mostrarQuantidadeObjetosCriados() {
        System.out.println("Quantidade de objetos criados: " + qtdFormasCriadas);
    }
}
