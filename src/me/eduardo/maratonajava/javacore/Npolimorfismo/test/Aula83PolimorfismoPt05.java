package me.eduardo.maratonajava.javacore.Npolimorfismo.test;

import me.eduardo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class Aula83PolimorfismoPt05 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");

        System.out.println(list);

        System.out.println("-------------");
    }
}
