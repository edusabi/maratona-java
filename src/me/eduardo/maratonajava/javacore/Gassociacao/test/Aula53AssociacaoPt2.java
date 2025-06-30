package me.eduardo.maratonajava.javacore.Gassociacao.test;

import me.eduardo.maratonajava.javacore.Gassociacao.domain.Jogador;
import me.eduardo.maratonajava.javacore.Gassociacao.domain.Time;

public class Aula53AssociacaoPt2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
