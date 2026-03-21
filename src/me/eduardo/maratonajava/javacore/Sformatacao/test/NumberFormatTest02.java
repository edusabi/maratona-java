package me.eduardo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localePT);
        nfa[2] = NumberFormat.getCurrencyInstance(localeHolanda);
        nfa[3] = NumberFormat.getCurrencyInstance(localeJapan);

        double valor = 100_000_000.2130;

        for(NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1000";

        try{
            System.out.println(nfa[0].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
