package me.eduardo.maratonajava.javacore.AintroducaoClasses.test;

import me.eduardo.maratonajava.javacore.AintroducaoClasses.domain.Estudante;

public class Aula31IntroduçãoClassesPt02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Sanji";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
