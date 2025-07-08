package me.eduardo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        //uso a palavra reservada super para e depois a funcao imprime, para imprimar os dados que já
        //tinha na outra class, apenas adicionando o salário em seguida
        super.imprime();
        System.out.println(this.salario);
    }

    ///consigo acessar o nome que está na class Pessoa
    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
