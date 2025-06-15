package me.eduardo.maratonajava.javacore.BintroducaoMetodos.exercicios.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario1);
        System.out.println(this.salario2);
        System.out.println(this.salario3);
    }

    public void imprimeMediaSalario() {
        double salarios = this.salario1 + this.salario2 + this.salario3;
        System.out.println("A média dos salários é: " + salarios / 3 );
    }

}
