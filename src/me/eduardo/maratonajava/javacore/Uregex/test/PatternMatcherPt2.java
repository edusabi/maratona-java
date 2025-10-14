package me.eduardo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherPt2 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo oq nao for digito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no /w

        String regex = "\\W";
//        String text = "abaaba";
        String text2 = "@#hh_j2 12gvh21";

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
