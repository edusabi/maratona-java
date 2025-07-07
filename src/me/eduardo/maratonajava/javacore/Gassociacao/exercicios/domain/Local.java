package me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain;

public class Local {
    private String endereco;

    public void imprimeLocal(){
        System.out.println(endereco);
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
