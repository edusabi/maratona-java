package me.eduardo.maratonajava.javacore.BintroducaoMetodos.exercicios.test;

import me.eduardo.maratonajava.javacore.BintroducaoMetodos.exercicios.domain.Funcionario;

public class Aula42TestFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.nome = "Eduardo";
        func.idade = 21;
        func.salario1 = 2000.00;
        func.salario2 = 3000.00;
        func.salario3 = 4000.00;

        func.imprimeFuncionario();
        func.imprimeMediaSalario();
    }


}
