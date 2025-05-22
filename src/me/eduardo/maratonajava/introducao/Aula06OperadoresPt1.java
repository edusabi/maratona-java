package me.eduardo.maratonajava.introducao;

public class Aula06OperadoresPt1 {
    public static void main(String[] args){

        ///Operadores aritméticos = + - / *

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);

        System.out.println(num1 - num2);

        System.out.println(num2 / num1);

        double dividirNumeros = num1 / (double)num2;
        System.out.println(dividirNumeros);

        System.out.println(num1 * num2);

        // Como tem uma String antes da operação ele identifica como String e concatena tudo
        System.out.println("Valor " + num1 + num2);
        System.out.println(num1 + num2 + " Valor " + num1 + num2);

    }
}
