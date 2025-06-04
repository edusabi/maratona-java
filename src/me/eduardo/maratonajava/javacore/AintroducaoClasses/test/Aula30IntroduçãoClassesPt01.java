package me.eduardo.maratonajava.javacore.AintroducaoClasses.test;

import me.eduardo.maratonajava.javacore.AintroducaoClasses.domain.Estudante;

public class Aula30IntroduçãoClassesPt01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Eduardo";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
