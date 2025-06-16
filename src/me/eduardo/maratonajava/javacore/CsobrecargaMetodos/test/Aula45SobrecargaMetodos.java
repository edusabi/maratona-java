package me.eduardo.maratonajava.javacore.CsobrecargaMetodos.test;

import me.eduardo.maratonajava.javacore.CsobrecargaMetodos.Domain.Anime;

public class Aula45SobrecargaMetodos {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive","TV",12 );
        anime.setGenero("Ação");
        anime.imprime();

    }
}
