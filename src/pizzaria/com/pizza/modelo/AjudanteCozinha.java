package pizzaria.com.pizza.modelo;

public class AjudanteCozinha extends Funcionario {

    private String numeroCNH;

    public AjudanteCozinha() {
        super();
    }

    public AjudanteCozinha(String nome, double salario, String dataNascimento, String dataAdmissao, String cpf, String pis, Endereco endereco, String numeroCNH) {
        super(nome, salario, dataNascimento, dataAdmissao, cpf, pis, endereco);
        this.numeroCNH = numeroCNH;
    }

    public String getnumeroCNH() {
        return numeroCNH;
    }

    public void setnumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

}