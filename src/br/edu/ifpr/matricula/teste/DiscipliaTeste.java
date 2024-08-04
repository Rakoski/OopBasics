package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class DiscipliaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcelo");
        Disciplina disciplina = new Disciplina("Orientação a Objetos", 60, 2024, professor);

        System.out.println(disciplina.getNome());
        System.out.println(disciplina.getCargaHoraria());
        System.out.println(disciplina.getAno());
        System.out.println(disciplina.getProfessor().getNome());
    }
}