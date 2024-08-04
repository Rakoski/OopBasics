package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class TurmaTeste {
    public static void main(String[] args) {
        Curso curso = new Curso("Engenharia de Software", "2024-01-01", "noturno");
        Turma turma = new Turma("ES", 20, 2024, curso);

        System.out.println(turma.getNome());
        System.out.println(turma.getNumeroMinimo());
        System.out.println(turma.getAnoIngresso());
        System.out.println(turma.getCurso().getNome());
    }
}