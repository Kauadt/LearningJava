package com.kauadt.javacore.Npolimorfismo.services;

import com.kauadt.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
