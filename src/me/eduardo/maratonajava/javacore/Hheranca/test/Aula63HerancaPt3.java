package me.eduardo.maratonajava.javacore.Hheranca.test;


import me.eduardo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class Aula63HerancaPt3 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Eduardo");

        f1.setNome("Eduardo");
        f1.setSalario(5000);

        f1.relatorioPagamento();

    }
}
