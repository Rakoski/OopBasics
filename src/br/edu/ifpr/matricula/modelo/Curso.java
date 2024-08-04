package br.edu.ifpr.matricula.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String dataCriacao;
    private String periodo;
    private List<Turma> turmas;
    private List<Disciplina> disciplinas;

    public Curso(String nome, String dataCriacao, String periodo) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.periodo = periodo;
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}