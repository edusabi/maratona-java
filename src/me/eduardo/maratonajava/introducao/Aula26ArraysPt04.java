package me.eduardo.maratonajava.introducao;

public class Aula26ArraysPt04 {
    public static void main(String[] args) {
        //for each e nova forma de escrever array

        //Novas formas de escrever um array
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i] + ", Forma 2");
        }

        System.out.println("-----");

        int[] numeros3 = new int[]{6,7,8,9};
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i] + ", Forma 3");
        }

        System.out.println("-----");

        int[] numeros4 = {10, 11, 12, 13, 14, 15};
        for(int num: numeros4){
            System.out.println(num + ", Forma 4");
        }



    }
}
