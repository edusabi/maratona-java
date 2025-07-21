package me.eduardo.maratonajava.javacore.Npolimorfismo.test;

import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Aula79PolimorfismoPt1 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);

        System.out.println("-----------");

        CalculadoraImposto.calcularImpostoComputador(tomate);
    }
}
