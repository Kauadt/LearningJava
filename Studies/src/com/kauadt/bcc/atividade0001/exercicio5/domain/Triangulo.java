package exercicio5.domain;

public class Triangulo extends PoligonoBaseAltura {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }

}
