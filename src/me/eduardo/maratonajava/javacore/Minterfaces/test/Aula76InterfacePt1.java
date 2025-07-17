package me.eduardo.maratonajava.javacore.Minterfaces.test;

import me.eduardo.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import me.eduardo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class Aula76InterfacePt1 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
    }
}
