package me.eduardo.maratonajava.javacore.Gassociacao.test;

import me.eduardo.maratonajava.javacore.Gassociacao.domain.Escola;
import me.eduardo.maratonajava.javacore.Gassociacao.domain.Professor;

public class Aula54AssociacaoPt3 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");

        Escola escola = new Escola("Konoha", new Professor[]{professor1, professor2});

        escola.imprime();


    }
}
