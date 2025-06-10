package me.eduardo.maratonajava.javacore.BintroducaoMetodos.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.Calculadora;

public class Aula41MetodosPt08Varargs {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] newArray = {1,2,3,4,5};

        calculadora.somaArray(newArray);

        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9,10);

    }
}
