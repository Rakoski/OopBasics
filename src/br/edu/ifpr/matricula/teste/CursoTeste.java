package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class CursoTeste {
    public static void main(String[] args) {
        Curso curso = new Curso("ENgenharia de software", "2023-01-01", "noturno");

        System.out.println(curso.getNome());
        System.out.println(curso.getDataCriacao());
        System.out.println(curso.getPeriodo());
    }
}