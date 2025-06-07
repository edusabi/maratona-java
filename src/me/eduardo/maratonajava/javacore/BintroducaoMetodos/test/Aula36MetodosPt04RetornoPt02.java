package me.eduardo.maratonajava.javacore.BintroducaoMetodos.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.Calculadora;

public class Aula36MetodosPt04RetornoPt02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.divideDoisNumeros02(20,2));

        System.out.println("----------");

        calculadora.imprimeDivisaoDoisNumeros(86,2);

    }
}
