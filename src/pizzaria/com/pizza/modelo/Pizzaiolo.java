package pizzaria.com.pizza.modelo;

public class Pizzaiolo {

    private String nome;
    private String dataNascimento;
    private double salario;
    private String dataAdmissao;
    private String cpf;
    private String pis;

    private Endereco endereco;

    public Pizzaiolo() {

    }

    public Pizzaiolo(String nome, String dataNascimento, double salario, String dataAdmissao, String cpf, String pis, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
        this.pis = pis;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}