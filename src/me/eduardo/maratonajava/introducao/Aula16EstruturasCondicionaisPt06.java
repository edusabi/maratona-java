package me.eduardo.maratonajava.introducao;

public class Aula16EstruturasCondicionaisPt06 {
    public static void main(String[] args) {
        ////Switch
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        ;
    }
}
