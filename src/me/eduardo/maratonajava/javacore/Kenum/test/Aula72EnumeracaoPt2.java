package me.eduardo.maratonajava.javacore.Kenum.test;

import me.eduardo.maratonajava.javacore.Kenum.domain.TipoCliente;

public class Aula72EnumeracaoPt2 {
    public static void main(String[] args) {
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
        System.out.println(tipoCliente);
    }
}
