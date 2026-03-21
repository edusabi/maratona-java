package me.eduardo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localePT);
        nfa[2] = NumberFormat.getInstance(localeHolanda);
        nfa[3] = NumberFormat.getInstance(localeJapan);

        double valor = 100_000_000.2130;

        for(NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }
    }
}
