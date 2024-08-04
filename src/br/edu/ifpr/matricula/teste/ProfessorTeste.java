package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Dra. Santos");

        System.out.println("Nome do Professor: " + professor.getNome());
    }
}