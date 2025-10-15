package me.eduardo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherPt3 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo oq nao for digito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no /w
        // [] =

//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fAA-F]";
//        String text = "abaaba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);


        System.out.println("Texto: " + text2);
        System.out.println("indice: " + "0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
        }

    }
}
