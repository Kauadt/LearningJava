package com.kauadt.javacore.Csobrecargametodos.test;

import com.kauadt.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto Shippuden", "TV", 12);
        anime.init("Naruto Shippuden", "TV", 12, "Ação");
        anime.imprime();
    }
}
