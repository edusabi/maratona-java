package me.eduardo.maratonajava.javacore.JmodificadorFinal.domain;

public class Comprador {
    private String nome;
    public static final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
