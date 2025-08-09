package com.kauadt.javacore.Gassociacao.test;

import com.kauadt.javacore.Gassociacao.domain.Jogador;
import com.kauadt.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafú");
        Jogador jogador2= new Jogador("Pelé");
        Time time = new Time("Brasil");

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(new Jogador[]{jogador1, jogador2});

        System.out.println("--- Jogador ---");

        jogador1.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
