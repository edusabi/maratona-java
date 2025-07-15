package me.eduardo.maratonajava.javacore.LclassesAbstratas.test;

import me.eduardo.maratonajava.javacore.LclassesAbstratas.domain.Desenvolvedor;
import me.eduardo.maratonajava.javacore.LclassesAbstratas.domain.Funcionario;
import me.eduardo.maratonajava.javacore.LclassesAbstratas.domain.Gerente;

public class Aula73ClasseAbstratasPt1 {
    public static void main(String[] args) {
        Gerente Gerente = new Gerente("Nami", 5000);
        System.out.println(Gerente);

        System.out.println("----------");

        Desenvolvedor Desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(Desenvolvedor);
    }
}
