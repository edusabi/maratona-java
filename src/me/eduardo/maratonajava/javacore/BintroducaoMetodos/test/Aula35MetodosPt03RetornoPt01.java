package me.eduardo.maratonajava.javacore.BintroducaoMetodos.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.Calculadora;

public class Aula35MetodosPt03RetornoPt01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

       double resultadoDivisao = calculadora.divideDoisNumeros(10,0);
        System.out.println(resultadoDivisao);
        System.out.println(calculadora.divideDoisNumeros(10,5));
    }
}
