package me.eduardo.maratonajava.introducao;

public class Aula08e09OperadoresPt3 {
    public static void main(String[] args) {
        // Operadores lógicos

        // && (AND) || (OR)

        //AND
        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);

        System.out.println("------");

        //OR
        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPlay5 = 5000F;

        boolean isPlay5Compravel = valorContaCorrente > valorPlay5 || valorContaPoupanca > valorPlay5;
        System.out.println("isPlay5Compravel " + isPlay5Compravel);

    }
}
