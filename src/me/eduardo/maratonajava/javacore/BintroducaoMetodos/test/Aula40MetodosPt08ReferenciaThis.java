package me.eduardo.maratonajava.javacore.BintroducaoMetodos.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.Estudante;

public class Aula40MetodosPt08ReferenciaThis {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Zoro";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Luffy";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
