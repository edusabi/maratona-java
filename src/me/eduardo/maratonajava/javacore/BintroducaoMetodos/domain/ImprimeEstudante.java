package me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain;

public class ImprimeEstudante {
    public void imprimeEstudante(Estudante estudante) {

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Gohan";

        System.out.println("----------");
    }
}
