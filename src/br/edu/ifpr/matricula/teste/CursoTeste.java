package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class CursoTeste {
    public static void main(String[] args) {
        Curso curso = new Curso("Ciência da Computação", "2024-01-01", "Noturno");

        System.out.println("Curso: " + curso.getNome());
        System.out.println("Data de Criação: " + curso.getDataCriacao());
        System.out.println("Período: " + curso.getPeriodo());
    }
}