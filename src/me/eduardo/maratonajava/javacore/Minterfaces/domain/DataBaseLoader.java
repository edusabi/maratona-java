package me.eduardo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }
}
