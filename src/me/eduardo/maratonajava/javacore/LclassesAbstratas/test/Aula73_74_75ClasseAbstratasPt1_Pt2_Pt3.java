package me.eduardo.maratonajava.javacore.LclassesAbstratas.test;

import me.eduardo.maratonajava.javacore.LclassesAbstratas.domain.Desenvolvedor;
import me.eduardo.maratonajava.javacore.LclassesAbstratas.domain.Gerente;

public class Aula73_74_75ClasseAbstratasPt1_Pt2_Pt3 {
    public static void main(String[] args) {
        Gerente Gerente = new Gerente("Nami", 5000);
        System.out.println(Gerente);

        System.out.println("----------");

        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);

        System.out.println("----------");

        desenvolvedor.imprime();


    }
}
