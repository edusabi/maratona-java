package me.eduardo.maratonajava.introducao;

public class Aula27ArraysMultidimensionaisPt01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 28;
        dias[1][1] = 31;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
                for (int j = 0; j < dias[i].length; j++) {
                    System.out.println(j + " j do 1° for");
                    System.out.println(dias[i][j]);
                }
        }

    }
}
