package me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain;

import me.eduardo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;


    public void imprimeSeminario(){
        System.out.println(titulo);
        if(alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
        System.out.println(local.getEndereco());
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno) {
        this.titulo = titulo;
        this.alunos = aluno;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this.titulo = titulo;
        this.alunos = aluno;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
