package pizzaria.com.pizza.modelo;

public class Entregador {
    private String nome;
    private double salario;
    private String dataNascimento;
    private String dataAdmissao;
    private String cpf;
    private String pis;
    private Endereco endereco;

    public Entregador(String nome, double salario, String dataNascimento, String dataAdmissao, String cpf, String pis, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
        this.pis = pis;
        this.endereco = endereco;
    }

    public Entregador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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