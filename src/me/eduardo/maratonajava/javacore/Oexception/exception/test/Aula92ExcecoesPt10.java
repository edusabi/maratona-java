package me.eduardo.maratonajava.javacore.Oexception.exception.test;

import me.eduardo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class Aula92ExcecoesPt10 {
    public static void main(String[] args) {
        try{
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String passwordDigitado = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        };

        System.out.println("Login feito com sucesso!");
    }

}
