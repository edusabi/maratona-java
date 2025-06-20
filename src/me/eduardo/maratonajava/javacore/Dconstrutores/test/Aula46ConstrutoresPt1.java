package me.eduardo.maratonajava.javacore.Dconstrutores.test;

import me.eduardo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class Aula46ConstrutoresPt1 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV",12, "Ação");
        Anime anime2 = new Anime();

//        anime.init("Akudama Drive","TV",12 );
//        anime.setGenero("Ação");
        anime.imprime();
        System.out.println("-----------");
        anime2.imprime();

    }
}
