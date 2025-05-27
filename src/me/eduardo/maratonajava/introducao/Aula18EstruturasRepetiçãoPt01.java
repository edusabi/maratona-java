package me.eduardo.maratonajava.introducao;

public class Aula18EstruturasRepetiçãoPt01 {
    public static void main(String[] args) {
        // while  do while  for
        int contador = 11;

        while(contador < 10){
        System.out.println("Dentro do while: " + contador);
            contador ++;
        }

        do{
            System.out.println("Dentro do do-while.");
        }while(contador < 10);

        for(int i = 0; i <= 10; ++i){
            System.out.println("Dentro do for: i = " + i);
        }

    }
}
