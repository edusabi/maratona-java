package me.eduardo.maratonajava.javacore.Npolimorfismo.servico;

import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import me.eduardo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto...");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Produto valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());

            // ou
//                String dataValidade = ((Tomate) produto).getDataValidade();
//                System.out.println(dataValidade);

            // ou
//                System.out.println(((Tomate) produto).getDataValidade());

        }

    }

}
