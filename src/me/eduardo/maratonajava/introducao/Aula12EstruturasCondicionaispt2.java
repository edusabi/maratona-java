package me.eduardo.maratonajava.introducao;

public class Aula12EstruturasCondicionaispt2 {
    public static void main(String[] args) {
        // Else
        int idade = 21;
        boolean isAuthCompraBebida = idade >= 18;

        if(isAuthCompraBebida){
            System.out.println("Pode comprar bebida alcólica!");
        }else{
            System.out.println("Não pode comprar bebida alcólica!");

        }

        // Else if
        System.out.println("-----");
        String categoria;

        if (idade < 15){
            categoria = "Categoria infantil!";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil!";
        }else{
            categoria = "Categoria adulto!";
        }

        System.out.println(categoria);


    }
}
