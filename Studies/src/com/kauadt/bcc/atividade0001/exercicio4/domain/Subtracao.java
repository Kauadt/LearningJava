package exercicio4.domain;

public class Subtracao extends OperacaoMatematica {
    public void calcular(double num1, double num2) {
        double subtracao = num1 - num2;
        System.out.println("O resultado da subtração é: " + subtracao);
    }
}
