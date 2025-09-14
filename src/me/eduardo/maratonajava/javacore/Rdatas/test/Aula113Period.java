package me.eduardo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class Aula113Period {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);

        Period p2 = Period.ofDays(10);
        System.out.println(p2 );

        Period p3 = Period.ofWeeks(58);
        System.out.println(p3 );

        Period p4 = Period.ofMonths(3);
        System.out.println(p4 );

        Period p5 = Period.ofYears(3);
        System.out.println(p5);
    }
}
