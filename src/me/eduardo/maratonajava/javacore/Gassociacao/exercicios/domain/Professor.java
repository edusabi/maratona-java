package me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain;

import me.eduardo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public void imprimeProfessor() {
        System.out.println(nome);
        System.out.println(especialidade);
        if(seminario == null) return;
        for (Seminario semi : seminario) {
            System.out.println(semi.getTitulo());
        }
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
