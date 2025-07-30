package me.eduardo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Pessoa{
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Pessoa Salvada");
    }

}
