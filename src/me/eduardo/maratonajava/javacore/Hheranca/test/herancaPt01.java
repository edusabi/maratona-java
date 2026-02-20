package me.eduardo.maratonajava.javacore.Hheranca.test;

import me.eduardo.maratonajava.javacore.Hheranca.domain.Endereco;
import me.eduardo.maratonajava.javacore.Hheranca.domain.Funcionario;
import me.eduardo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class herancaPt01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das laranjas");
        endereco.setCep("55892-512");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria Silva");
        pessoa.setCpf("08489753478");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nobunaga");
        funcionario.setCpf("86578924525");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1500);

        System.out.println("--------------");
        funcionario.imprime();
    }
}
