package me.eduardo.maratonajava.introducao;

public class Aula11EstruturasCondicionaispt1 {
    public static void main(String[] args) {

        //IF
        int idade = 15;
        boolean isAuthCompraBebida = idade >= 18;

        if(isAuthCompraBebida){
            System.out.println("Pode comprar bebida alcólica!");
        }

        if(!isAuthCompraBebida){
            System.out.println("Não pode comprar bebida alcólica!");
        }
}
}
