package me.eduardo.maratonajava.javacore.QclassesUtilitarias.test;

public class Aula99StringPt4 {
    public static void main(String[] args) {
        String nome = "Luis Eduardo";
        nome.concat(" Sabino");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Luis Eduardo");
        sb.append(" Sabino").append(" da").append(" Silva");
        sb.reverse();
        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
    }
}
