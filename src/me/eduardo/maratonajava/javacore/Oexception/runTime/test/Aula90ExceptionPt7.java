package me.eduardo.maratonajava.javacore.Oexception.runTime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Aula90ExceptionPt7 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(RuntimeException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }

        try{
            talvezLanceExececao();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceExececao() throws SQLException, FileNotFoundException{

    }
}
