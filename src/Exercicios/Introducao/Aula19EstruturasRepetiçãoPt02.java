package Exercicios.Introducao;

public class Aula19EstruturasRepetiçãoPt02 {
    public static void main(String[] args) {
        int contador = 0;

//        while (contador <= 1000000){
//            contador++;
//            if (contador % 2 == 0){
//                System.out.println(contador);
//            };
//        }

        for(contador = 0; contador <= 1000000; contador++){
            if(contador % 2 == 1){
                System.out.println("Contador for: " + contador);
            }
        }

    }
}
