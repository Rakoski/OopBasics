package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class MatriculaTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Mateus Rakoski", "123.456.789-01");
        Curso curso = new Curso("Engenharia de Software", "2023-01-01", "noturno");
        Turma turma = new Turma("ES ", 25, 2024, curso);
        Matricula matricula = new Matricula("20230006221", "2023-02-01", estudante, turma);

        System.out.println(matricula.getRa());
        System.out.println(matricula.getData());
        System.out.println(matricula.getEstudante().getNome());
        System.out.println(matricula.getTurma().getNome());
    }
}