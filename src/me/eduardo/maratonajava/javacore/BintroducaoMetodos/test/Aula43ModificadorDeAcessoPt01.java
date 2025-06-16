package me.eduardo.maratonajava.javacore.BintroducaoMetodos.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.Pessoa;

public class Aula43ModificadorDeAcessoPt01 {
    public static void main(String[] args) {
        // private, get e set
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
//        pessoa.imprime();
    }
}
