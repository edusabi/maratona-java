package me.eduardo.maratonajava.introducao;

public class Aula10OperadoresPt4 {
    public static void main(String[] args) {
        // Atribuição = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        bonus -= 800;
        System.out.println(bonus);

        bonus /= 20;
        System.out.println(bonus);

        bonus *= 10;
        System.out.println(bonus);

        bonus %= 2;
        System.out.println(bonus);

        //
        System.out.println("-----");
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);

    }
}
