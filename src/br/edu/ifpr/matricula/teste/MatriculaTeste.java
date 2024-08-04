package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class MatriculaTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("João", "123.456.789-00");
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas", "2024-01-01", "Manhã");
        Turma turma = new Turma("Turma B", 25, 2024, curso);
        Matricula matricula = new Matricula("RA001", "2024-02-01", estudante, turma);

        System.out.println("RA: " + matricula.getRa());
        System.out.println("Data: " + matricula.getData());
        System.out.println("Estudante: " + matricula.getEstudante().getNome());
        System.out.println("Turma: " + matricula.getTurma().getNome());
    }
}