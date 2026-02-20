package me.eduardo.maratonajava.javacore.Kenum.test;

import me.eduardo.maratonajava.javacore.Kenum.domain.Cliente;
import me.eduardo.maratonajava.javacore.Kenum.domain.TipoCliente;
import me.eduardo.maratonajava.javacore.Kenum.domain.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
