package me.eduardo.maratonajava.javacore.JmodificadorFinal.test;

import me.eduardo.maratonajava.javacore.JmodificadorFinal.domain.Comprador;

public class Aula68ModificadorFinalPt2 {
    public static void main(String[] args) {
        Comprador comprador = new Comprador();
        System.out.println(comprador.COMPRADOR);
        comprador.COMPRADOR.setNome("Kuririn");
        System.out.println(comprador.COMPRADOR);
    }
}
