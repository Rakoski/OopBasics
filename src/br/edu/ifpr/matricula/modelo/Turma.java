package br.edu.ifpr.matricula.modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private int numeroMinimo;
    private int anoIngresso;
    private Curso curso;
    private List<Matricula> matriculas;

    public Turma(String nome, int numeroMinimo, int anoIngresso, Curso curso) {
        this.nome = nome;
        this.numeroMinimo = numeroMinimo;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.matriculas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(int numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}