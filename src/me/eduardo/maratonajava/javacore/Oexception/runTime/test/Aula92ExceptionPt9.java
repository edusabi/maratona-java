package me.eduardo.maratonajava.javacore.Oexception.runTime.test;

import me.eduardo.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import me.eduardo.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class Aula92ExceptionPt9 {
    public static void main(String[] args) {
        lerArquivo();

    }

    public static void lerArquivo(){
        try(
                Leitor1 leitor1 = new Leitor1();
                Leitor2 leitor2 = new Leitor2();
           ){

        }catch (IOException e){
            e.printStackTrace();
        }
    }



    public static void lerArquivo2(){
        Reader reader = null;
        try{
        reader = new BufferedReader(new FileReader("teste.txt"));

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }finally {
            try{
                reader.close();
            }catch (IOException e){
                    e.printStackTrace();
            }
        }

    }

}
