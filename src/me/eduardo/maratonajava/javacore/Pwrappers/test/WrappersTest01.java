package me.eduardo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
//        Deixam de ser números primitivos e passam a ser classes

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'A';
        Boolean boolW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TrUe");
        System.out.println(verdadeiro);
    }
}
