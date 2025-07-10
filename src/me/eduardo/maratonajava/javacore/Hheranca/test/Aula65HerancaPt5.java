package me.eduardo.maratonajava.javacore.Hheranca.test;

import me.eduardo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class Aula65HerancaPt5 {
    public static void main(String[] args) {

        // 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe pai
        // 1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carregar a classe filha
        // 2 - Alocado espaço em memoria para objeto da super classe
        // 3 - Cada atributo da super classe  é criado e inicializado com valores default ou o que foi passado
        // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
        // 5 - Construtor da super classe é executado

        // 6 - Alocado espaço em memoria para objeto da sub classe
        // 7 - Cada atributo da sub classe é criado e inicializado com valores default ou o que foi passado
        // 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
        // 9 - Construtor da sub classe é executado

        Funcionario funcionario = new Funcionario("Aiala");
    }
}
