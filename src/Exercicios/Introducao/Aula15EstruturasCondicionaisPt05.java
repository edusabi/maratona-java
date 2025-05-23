package Exercicios.Introducao;

public class Aula15EstruturasCondicionaisPt05 {
    public static void main(String[] args) {
        double salarioAnual = 50000;
        double porcentagem1 = 9.70;
        double porcentagem2 = 37.35;
        double porcentagem3 = 49.50;

        double impostoApagar;

        if (salarioAnual >= 0 && salarioAnual <= 34712) {
            impostoApagar = (porcentagem1 / 100) * salarioAnual;
            System.out.println("Você irá ter que pagar: " + String.format("%.2f",impostoApagar));
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            impostoApagar = (porcentagem2 / 100) * salarioAnual;
            System.out.println("Você irá ter que pagar: " + String.format("%.2f",impostoApagar));
        }else{
            impostoApagar = (porcentagem3 / 100) * salarioAnual;
            System.out.println("Você irá ter que pagar: " + String.format("%.2f",impostoApagar));
        }

    }
}
