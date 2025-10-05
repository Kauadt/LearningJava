package exercicio4.domain;

public class Soma extends OperacaoMatematica {

    @Override
    public void calcular(double num1, double num2) {
        double soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);
    }

}
