package exercicio4.test;

import exercicio4.domain.Divisao;
import exercicio4.domain.Multiplicacao;
import exercicio4.domain.OperacaoMatematica;
import exercicio4.domain.Soma;
import exercicio4.domain.Subtracao;

public class OperacaoMatematicaTest {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();

        soma.calcular(80.5, 100.15);
        subtracao.calcular(130, 500);
        multiplicacao.calcular(10, 15);
        divisao.calcular(70, 5);

    }
}
