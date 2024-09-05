package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class TesteGeral {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcelo");

        Disciplina disciplina = new Disciplina("Orientação à Objetos", 60, 2024, professor);

        Curso curso = new Curso("Engenharia de Software", "2023-01-01", "noturno");

        Turma turma = new Turma("ES", 20, 2023, curso);

        Estudante estudante = new Estudante("Mateus Rakoski", "123.456.789-01");

        Matricula matricula = new Matricula("20230006149", "2023-01-01", estudante, turma);

        System.out.println("Nome do professor: " + professor.getNome());

        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Carga horária: " + disciplina.getCargaHoraria());
        System.out.println("Ano: " + disciplina.getAno());
        System.out.println("Professor: " + disciplina.getProfessor().getNome());

        System.out.println("Nome: " + curso.getNome());
        System.out.println("Data de criação: " + curso.getDataCriacao());
        System.out.println("Período: " + curso.getPeriodo());

        System.out.println("Nome: " + turma.getNome());
        System.out.println("Número mínimo: " + turma.getNumeroMinimo());
        System.out.println("Ano de ingresso: " + turma.getAnoIngresso());
        System.out.println("Curso: " + turma.getCurso().getNome());

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("CPF: " + estudante.getCpf());

        System.out.println("RA: " + matricula.getRa());
        System.out.println("Data: " + matricula.getData());
        System.out.println("primeiro.Estudante: " + matricula.getEstudante().getNome());
        System.out.println("Turma: " + matricula.getTurma().getNome());
    }
}