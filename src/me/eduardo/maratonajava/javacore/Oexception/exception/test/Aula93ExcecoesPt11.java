package me.eduardo.maratonajava.javacore.Oexception.exception.test;

import me.eduardo.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import me.eduardo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;
import me.eduardo.maratonajava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class Aula93ExcecoesPt11 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
