package me.eduardo.maratonajava.javacore.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Aula106NumberFormatPt2 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localeBR);
        nf[2] = NumberFormat.getCurrencyInstance(localeIT);
        nf[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 1000.2130;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }


        try {
            String valorString = "￥1,000.21";
            System.out.println(nf[3].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
