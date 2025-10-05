package exercicio4.domain;

public class Divisao extends OperacaoMatematica {
    public void calcular(double num1, double num2) {
        double divisao = num1 / num2;
        System.out.println("O resultado da divisão é: " + divisao);
    }
}
