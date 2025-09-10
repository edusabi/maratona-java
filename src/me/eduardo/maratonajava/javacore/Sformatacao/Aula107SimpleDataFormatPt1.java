package me.eduardo.maratonajava.javacore.Sformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula107SimpleDataFormatPt1 {
    public static void main(String[] args) {
        String pattern = "'Brazil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try{
            System.out.println(sdf.parse("Brazil 10 de September de 2025"));
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
