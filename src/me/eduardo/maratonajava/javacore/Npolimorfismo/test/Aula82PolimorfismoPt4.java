package me.eduardo.maratonajava.javacore.Npolimorfismo.test;

import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Aula82PolimorfismoPt4 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2025");


        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("---------------");

        CalculadoraImposto.calcularImposto(produto);
    }
}
