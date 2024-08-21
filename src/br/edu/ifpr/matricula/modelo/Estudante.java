package br.edu.ifpr.matricula.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private String cpf;
    private List<Matricula> matriculas;

    public Estudante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.matriculas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}