package me.eduardo.maratonajava.introducao;

public class Aula07OperadoresPt2 {
    public static void main(String[] args) {

        // Operadores relacionais = %

        // %
        int resto = 20 % 5;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);

        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);

        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);



    }
}
