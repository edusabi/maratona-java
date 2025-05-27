package Exercicios.Introducao;

public class Aula17EstruturasCondicionaisPt07 {
    public static void main(String[] args) {
        int dia = 7;

//        switch (dia){
//            case 1:
//                System.out.println("Domingo, final de semana.");
//                break;
//            case 2:
//                System.out.println("Segunda, dia útil.");
//                break;
//            case 3:
//                System.out.println("Terça, dia útil.");
//                break;
//            case 4:
//                System.out.println("Quarta, dia útil.");
//                break;
//            case 5:
//                System.out.println("Quinta, dia útil.");
//                break;
//            case 6:
//                System.out.println("Sexta, dia útil.");
//                break;
//            case 7:
//                System.out.println("Sabado, final de semana.");
//                break;
//            default:
//                System.out.println("Inválido");
//                break;


            switch (dia){
                case 1:
                case 7:
                    System.out.println("FDS");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia útil.");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
        }
    }
}
