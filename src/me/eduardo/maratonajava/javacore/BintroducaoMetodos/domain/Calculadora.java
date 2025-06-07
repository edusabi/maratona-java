package me.eduardo.maratonajava.javacore.BintroducaoMetodos.domain;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(50 - 20);
    }

    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros02(double num1, double num2){
        //caso o usuário digitar 0
        if(num2 != 0){
            return num1 / num2;
        }

        return 0;
    }

    public double divideDoisNumeros(double num1, double num2){
        //caso o usuário digitar 0
        if(num2 == 0){
            return 0;
        };
        return num1 / num2;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero.");
            return;
        }

        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera dois numeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

}
