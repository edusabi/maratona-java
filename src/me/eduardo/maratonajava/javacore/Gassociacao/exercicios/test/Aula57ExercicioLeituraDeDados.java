package me.eduardo.maratonajava.javacore.Gassociacao.exercicios.test;

import java.util.Scanner;

public class Aula57ExercicioLeituraDeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro...");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO.");

        String pergunta = scan.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }

    }
}
