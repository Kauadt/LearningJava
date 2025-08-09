package com.kauadt.javacore.Dconstrutores.test;

import com.kauadt.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto Shippuden", "TV", 12, "Ação");
        anime.imprime();
    }
}
