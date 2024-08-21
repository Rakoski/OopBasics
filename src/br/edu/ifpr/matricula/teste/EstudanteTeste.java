package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Mateus Rakoski", "123.456.789-01");

        System.out.println(estudante.getNome());
        System.out.println(estudante.getCpf());
    }
}