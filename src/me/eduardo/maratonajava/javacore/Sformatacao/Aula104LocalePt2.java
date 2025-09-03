package me.eduardo.maratonajava.javacore.Sformatacao;

import java.util.Locale;

public class Aula104LocalePt2 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguagens = Locale.getISOLanguages();

        for (String isoLanguagen : isoLanguagens) {
            System.out.print(isoLanguagen+" ");
        }

        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");
        }


    }
}
