package me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprimeAluno(){
        System.out.println(nome);
        if(seminario != null){
            System.out.println(seminario.getTitulo());
        }
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
