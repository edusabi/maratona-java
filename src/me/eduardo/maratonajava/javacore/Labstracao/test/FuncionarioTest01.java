package me.eduardo.maratonajava.javacore.Labstracao.test;

import me.eduardo.maratonajava.javacore.Labstracao.domain.Desenvolvedor;
import me.eduardo.maratonajava.javacore.Labstracao.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
