package me.eduardo.maratonajava.javacore.Eblocoinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {

        for (int eps: this.episodios){
            System.out.print(eps + " ");
        }

        System.out.println();

    }

    public String getNome() {
        return nome;
    }

}
