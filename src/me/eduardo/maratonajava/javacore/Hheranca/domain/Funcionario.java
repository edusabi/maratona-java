package me.eduardo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco static Funcionario");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionario 2");
    }

    //herança pt4 , quando eu adicionar um construtor na class pai, tenho que adicionar na class
    // filho usando o super e passando o parêmetro que neste caso é o nome
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do bloco constructor funcionario");
    }

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
