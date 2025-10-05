package exercicio4.domain;

public class Multiplicacao extends OperacaoMatematica {
    public void calcular(double num1, double num2) {
        double multiplicacao = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
    }
}
