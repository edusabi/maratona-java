package me.eduardo.maratonajava.javacore.BintroducaoMetodos.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.Estudante;
import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.ImprimeEstudante;

public class Aula38e39MetodosPt06ParametrosReferencia {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImprimeEstudante imprime = new ImprimeEstudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 17;
        estudante2.sexo = 'F';


        imprime.imprimeEstudante(estudante1);
        imprime.imprimeEstudante(estudante2);

        System.out.println("##############");

        imprime.imprimeEstudante(estudante1);
        imprime.imprimeEstudante(estudante2);

    }
}
