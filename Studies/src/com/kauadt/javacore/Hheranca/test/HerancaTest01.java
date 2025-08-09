package com.kauadt.javacore.Hheranca.test;

import com.kauadt.javacore.Hheranca.domain.Endereco;
import com.kauadt.javacore.Hheranca.domain.Funcionario;
import com.kauadt.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Kauã");
        pessoa.setCpf("123.234.556-23");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Pedro");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("------------------");
        funcionario.imprime();


    }
}
