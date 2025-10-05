package exercicio5.domain;

public class PoligonoBaseAltura extends Forma {

    double base, altura;

    public PoligonoBaseAltura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        if (base == altura) {
            System.out.println("A área do quadrado é: " + area);
            return;
        }
        System.out.println("A área do retângulo é: " + area);
    }
}