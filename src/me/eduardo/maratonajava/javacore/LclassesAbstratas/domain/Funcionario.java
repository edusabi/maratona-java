package me.eduardo.maratonajava.javacore.LclassesAbstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    // Classes abstratas PT 02
    // Métodos abstratos
    public abstract void calculaBonus();

}
