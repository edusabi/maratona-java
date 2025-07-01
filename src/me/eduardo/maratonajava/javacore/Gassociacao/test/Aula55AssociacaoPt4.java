package me.eduardo.maratonajava.javacore.Gassociacao.test;

import me.eduardo.maratonajava.javacore.Gassociacao.domain.Jogador;
import me.eduardo.maratonajava.javacore.Gassociacao.domain.Time;

public class Aula55AssociacaoPt4 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-------- Jogador -------");

        jogador.imprime();
        jogador2.imprime();

        System.out.println("-------- Time -------");

        time.imprime();

    }
}
