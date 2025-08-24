package me.eduardo.maratonajava.javacore.QclassesUtilitarias.test;

public class Aula96StringPt1 {
    public static void main(String[] args) {
        String nome = "Eduardo";
        String nome2 = "Eduardo";

        nome = nome.concat(" Sabino");
        System.out.println(nome);

        System.out.println(nome == nome2);

        String nome3 = new String("Eduardo"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
