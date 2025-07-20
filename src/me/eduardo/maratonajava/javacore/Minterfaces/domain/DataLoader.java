package me.eduardo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load();

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do dataLoader");
    }
}
