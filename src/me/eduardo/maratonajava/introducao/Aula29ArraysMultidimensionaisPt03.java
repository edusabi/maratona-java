package me.eduardo.maratonajava.introducao;

public class Aula29ArraysMultidimensionaisPt03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0,0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for(int[] arrayBase: arrayInt2){
            System.out.println("\n------");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }

    }
}
