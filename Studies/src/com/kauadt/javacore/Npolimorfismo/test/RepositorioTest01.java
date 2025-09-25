package com.kauadt.javacore.Npolimorfismo.test;

import com.kauadt.javacore.Npolimorfismo.repository.Repositorio;
import com.kauadt.javacore.Npolimorfismo.services.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
