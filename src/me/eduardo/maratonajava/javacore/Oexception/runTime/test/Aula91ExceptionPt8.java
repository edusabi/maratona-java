package me.eduardo.maratonajava.javacore.Oexception.runTime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Aula91ExceptionPt8 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch( IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }

        try{
            talvezLanceExececao();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void talvezLanceExececao() throws SQLException, IOException{

    }
}
