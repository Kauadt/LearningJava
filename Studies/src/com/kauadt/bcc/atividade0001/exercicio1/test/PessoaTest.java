package exercicio1.test;

import exercicio1.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kauã", 80, 1.75);
        System.out.println("IMC: " + String.format("%.2f", pessoa.calculateIMC()));
        System.out.println("Classificação do IMC: " + pessoa.classifyIMC());
    }
}
