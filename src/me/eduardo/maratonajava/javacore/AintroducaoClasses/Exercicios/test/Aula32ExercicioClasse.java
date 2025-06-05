package me.eduardo.maratonajava.javacore.AintroducaoClasses.Exercicios.test;

import me.eduardo.maratonajava.javacore.AintroducaoClasses.Exercicios.domain.Carro;

public class Aula32ExercicioClasse {
    public static void main(String[] args) {
    Carro carro = new Carro();
    Carro carro2 = new Carro();

    carro.nome = "Uno";
    carro.modelo = "Fiat";
    carro.ano = 2012;

    System.out.println(carro.nome);
    System.out.println(carro.modelo);
    System.out.println(carro.ano);

        System.out.println("------------");

        carro2.nome = "Corola";
        carro2.modelo = "Honda";
        carro2.ano = 2022;

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
