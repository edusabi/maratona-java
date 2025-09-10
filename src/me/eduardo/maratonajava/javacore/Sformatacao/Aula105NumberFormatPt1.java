package me.eduardo.maratonajava.javacore.Sformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula105NumberFormatPt1 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localeBR);
        nf[2] = NumberFormat.getInstance(localeIT);
        nf[3] = NumberFormat.getInstance(localeJP);

        double valor = 100_000_000.23158;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
