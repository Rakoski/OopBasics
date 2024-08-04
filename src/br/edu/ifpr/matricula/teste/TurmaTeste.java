package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class TurmaTeste {
    public static void main(String[] args) {
        Curso curso = new Curso("Engenharia de Software", "2024-01-01", "Integral");
        Turma turma = new Turma("Turma A", 20, 2024, curso);

        System.out.println("Turma: " + turma.getNome());
        System.out.println("Número Mínimo: " + turma.getNumeroMinimo());
        System.out.println("Ano de Ingresso: " + turma.getAnoIngresso());
        System.out.println("Curso: " + turma.getCurso().getNome());
    }
}