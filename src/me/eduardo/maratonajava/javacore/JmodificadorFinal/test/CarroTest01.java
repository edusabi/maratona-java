package me.eduardo.maratonajava.javacore.JmodificadorFinal.test;

import me.eduardo.maratonajava.javacore.JmodificadorFinal.domain.Carro;
import me.eduardo.maratonajava.javacore.JmodificadorFinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Eduardo");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
