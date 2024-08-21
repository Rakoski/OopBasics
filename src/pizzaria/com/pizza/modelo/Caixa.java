package pizzaria.com.pizza.modelo;

public class Caixa extends Funcionario {

    private int numeroCaixa;

    public Caixa() {
        super();

    }

    public Caixa(String nome, double salario, String dataNascimento, String dataAdmissao, String cpf, String pis, Endereco endereco, int numeroCaixa) {
        super(nome, salario, dataNascimento, dataAdmissao, cpf, pis, endereco);
        this.numeroCaixa = numeroCaixa;
    }

    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }
}