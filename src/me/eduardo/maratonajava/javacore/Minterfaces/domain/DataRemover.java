package me.eduardo.maratonajava.javacore.Minterfaces.domain;

public interface DataRemover {
    public abstract void remover();

    public default void checkPermission(){
        System.out.println("Checando permissões...");
    }
}
