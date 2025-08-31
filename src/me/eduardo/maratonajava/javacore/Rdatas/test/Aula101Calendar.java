package me.eduardo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class Aula101Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão de cria!!");
        };

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_WEEK, 2);
        calendar.roll(Calendar.HOUR, 10);

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
