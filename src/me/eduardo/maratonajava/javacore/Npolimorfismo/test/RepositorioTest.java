package me.eduardo.maratonajava.javacore.Npolimorfismo.test;

import me.eduardo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import me.eduardo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Kuririn");
        list.add("Goku");
        list.add("Vegeta");

        System.out.println(list);
    }
}
