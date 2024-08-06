package br.edu.ifpr.palestra.modelo;

public class Certificado {
    private int livro;
    private int folha;
    private int pagina;
    private int numeroDoCertificado;

    public Certificado(int livro, int folha, int pagina, int numeroDoCertificado) {
        this.livro = livro;
        this.folha = folha;
        this.pagina = pagina;
        this.numeroDoCertificado = numeroDoCertificado;
    }

    public int getLivro() {
        return livro;
    }

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public int getFolha() {
        return folha;
    }

    public void setFolha(int folha) {
        this.folha = folha;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getNumeroDoCertificado() {
        return numeroDoCertificado;
    }

    public void setNumeroDoCertificado(int numeroDoCertificado) {
        this.numeroDoCertificado = numeroDoCertificado;
    }
}
