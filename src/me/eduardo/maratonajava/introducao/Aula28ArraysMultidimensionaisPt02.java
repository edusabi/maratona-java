package me.eduardo.maratonajava.introducao;

public class Aula28ArraysMultidimensionaisPt02 {
    public static void main(String[] args) {
        //usando for each

        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 28;
        dias[1][1] = 31;
        dias[1][2] = 31;

        for(int[] arrayBase: dias){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
