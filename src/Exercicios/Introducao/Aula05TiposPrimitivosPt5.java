package Exercicios.Introducao;

public class Aula05TiposPrimitivosPt5 {
    public static void main(String[] args) {

        String nome = "Luís Eduardo";
        String endereco = "Rua São Paulo";
        double salario = 2500.00;
        String data = "20/05/2025";


        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " na data " + data);
        System.out.println(String.format("Eu %s, morando no endereço %s, confirmo que recebi o salário de %.2f na data %s", nome, endereco, salario, data));

    }
}
