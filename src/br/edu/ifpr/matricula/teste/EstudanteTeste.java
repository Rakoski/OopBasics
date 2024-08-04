package br.edu.ifpr.matricula.teste;

import br.edu.ifpr.matricula.modelo.*;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Maria", "987.654.321-00");

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("CPF: " + estudante.getCpf());
    }
}