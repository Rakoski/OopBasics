package br.edu.ifpr.matricula.modelo;

public class Matricula {
    private String ra;
    private String data;
    private Estudante estudante;
    private Turma turma;

    public Matricula(String ra, String data, Estudante estudante, Turma turma) {
        this.ra = ra;
        this.data = data;
        this.estudante = estudante;
        this.turma = turma;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}