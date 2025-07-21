package me.eduardo.maratonajava.javacore.Npolimorfismo.servico;

import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador...");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoComputador(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate...");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
