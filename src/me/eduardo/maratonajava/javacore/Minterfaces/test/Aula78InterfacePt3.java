package me.eduardo.maratonajava.javacore.Minterfaces.test;

import me.eduardo.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import me.eduardo.maratonajava.javacore.Minterfaces.domain.DataLoader;

public class Aula78InterfacePt3 {
    public static void main(String[] args) {
        DataBaseLoader db = new DataBaseLoader();
        DataLoader.retrieveMaxDataSize();
        db.retrieveMaxDataSize();

    }
}
