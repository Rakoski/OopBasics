package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class TesteGeral {
    public static void main(String[] args) {
        Professor professor = new Professor("Dra. Ana Silva");

        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", 60, 2024, professor);

        Curso curso = new Curso("Engenharia de Software", "2024-01-15", "Integral");

        Turma turma = new Turma("Turma A", 20, 2024, curso);

        Estudante estudante = new Estudante("João Santos", "123.456.789-00");

        Matricula matricula = new Matricula("RA2024001", "2024-02-01", estudante, turma);

        System.out.println("=== Dados do Professor ===");
        System.out.println("Nome: " + professor.getNome());

        System.out.println("\n=== Dados da Disciplina ===");
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
        System.out.println("Ano: " + disciplina.getAno());
        System.out.println("Professor: " + disciplina.getProfessor().getNome());

        System.out.println("\n=== Dados do Curso ===");
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Data de Criação: " + curso.getDataCriacao());
        System.out.println("Período: " + curso.getPeriodo());

        System.out.println("\n=== Dados da Turma ===");
        System.out.println("Nome: " + turma.getNome());
        System.out.println("Número Mínimo: " + turma.getNumeroMinimo());
        System.out.println("Ano de Ingresso: " + turma.getAnoIngresso());
        System.out.println("Curso: " + turma.getCurso().getNome());

        System.out.println("\n=== Dados do Estudante ===");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("CPF: " + estudante.getCpf());

        System.out.println("\n=== Dados da Matrícula ===");
        System.out.println("RA: " + matricula.getRa());
        System.out.println("Data: " + matricula.getData());
        System.out.println("Estudante: " + matricula.getEstudante().getNome());
        System.out.println("Turma: " + matricula.getTurma().getNome());
    }
}