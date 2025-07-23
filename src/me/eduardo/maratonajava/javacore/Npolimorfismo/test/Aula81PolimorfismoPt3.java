package me.eduardo.maratonajava.javacore.Npolimorfismo.test;

import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Aula81PolimorfismoPt3 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        CalculadoraImposto.calcularImposto(computador);

        System.out.println("------------");

        Tomate tomate = new Tomate("Tomate Inglês", 25);
        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("------------");
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(tv);
    }
}
