package br.edu.ifpr.matricula.modelo;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int ano;
    private Professor professor;

    public Disciplina(String nome, int cargaHoraria, int ano, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ano = ano;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}