package me.eduardo.maratonajava.javacore.Gassociacao.test;

import me.eduardo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class Aula52AssociacaoPt1 {
    public static void main(String[] args) {

    Jogador jogador1 = new Jogador("Pelé");
    Jogador jogador2 = new Jogador("Romário");
    Jogador jogador3 = new Jogador("Ronaldo");

    Jogador[] jogadores = {jogador1, jogador2, jogador3};

    for(Jogador jogador: jogadores){
        jogador.imprime();
    };

}
}
