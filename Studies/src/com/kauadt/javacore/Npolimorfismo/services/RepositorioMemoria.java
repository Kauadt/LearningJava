package com.kauadt.javacore.Npolimorfismo.services;

import com.kauadt.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
