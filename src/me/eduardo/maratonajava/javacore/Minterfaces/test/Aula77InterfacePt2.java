package me.eduardo.maratonajava.javacore.Minterfaces.test;

import me.eduardo.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import me.eduardo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class Aula77InterfacePt2 {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        fileLoader.remover();
        fileLoader.checkPermission();

        System.out.println("-------------");

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.remover();
        dataBaseLoader.checkPermission();
    }
}
