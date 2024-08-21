package pizzaria.com.pizza.modelo;

public class Garcom {

    private String nome;
    private double salario;
    private String dataNascimento;
    private String dataAdmissao;
    private String cpf;
    private String pis;
    private Endereco endereco;

    public Garcom(String nome, double salario, String dataNascimento, String dataAdmissao, String cpf, String pis, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
        this.pis = pis;
        this.endereco = endereco;
    }

    public Garcom() {
    }


}