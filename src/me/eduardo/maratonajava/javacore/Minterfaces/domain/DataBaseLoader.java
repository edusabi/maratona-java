package me.eduardo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do dataBaseLoader");
    }
}
