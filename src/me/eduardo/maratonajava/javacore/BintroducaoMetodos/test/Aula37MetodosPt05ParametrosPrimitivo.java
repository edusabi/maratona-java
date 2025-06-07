package me.eduardo.maratonajava.javacore.BintroducaoMetodos.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain.Calculadora;

public class Aula37MetodosPt05ParametrosPrimitivo {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //essa variavel nunca vai ser alterada
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Dentro do test.");
    }
}
