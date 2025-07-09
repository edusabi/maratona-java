package me.eduardo.maratonajava.javacore.Hheranca.test;

import me.eduardo.maratonajava.javacore.Hheranca.domain.Endereco;
import me.eduardo.maratonajava.javacore.Hheranca.domain.Funcionario;
import me.eduardo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class Aula60HerancaPt1ePt2ePt4 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("--------------");

        funcionario.imprime();
    }
}
