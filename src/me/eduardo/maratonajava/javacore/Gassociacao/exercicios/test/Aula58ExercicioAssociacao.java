package me.eduardo.maratonajava.javacore.Gassociacao.exercicios.test;

import me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain.Aluno;
import me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain.Local;
import me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain.Professor;
import me.eduardo.maratonajava.javacore.Gassociacao.exercicios.domain.Seminario;

public class Aula58ExercicioAssociacao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("José", 15);
        Aluno aluno2 = new Aluno("João", 17);
        Aluno[] alunos = {aluno1, aluno2};


        Professor prof1 = new Professor("Francisco", "TI");

        Seminario seminario = new Seminario("POO em java");
        Seminario[] seminarios = {seminario};
        Local local1 = new Local("Quarto do Java");

        ///setando o seminario no aluno
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        ///setando alunos no semenario
        seminario.setAlunos(alunos);

        ///setando o local no seminario
        seminario.setLocal(local1);

        ///setando o seminario no professor
        prof1.setSeminario(seminarios);


        System.out.println("Seminário:");
        seminario.imprimeSeminario();

        System.out.println("--------------");
        System.out.println("Aluno:");
        aluno1.imprimeAluno();
        System.out.println("--------Aluno2------");
        aluno2.imprimeAluno();

        System.out.println("--------------");
        System.out.println("Professor:");
        prof1.imprimeProfessor();

        System.out.println("--------------");
        System.out.println("Local:");
        local1.imprimeLocal();



    }
}
