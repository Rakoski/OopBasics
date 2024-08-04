package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class DiscipliaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Silva");
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", 60, 2024, professor);

        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
        System.out.println("Ano: " + disciplina.getAno());
        System.out.println("Professor: " + disciplina.getProfessor().getNome());
    }
}