package heranca.jurisdiques;

public class Funcionario extends PessoaFIsica {
    private String numeroCartao;

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    //nao tem como sobrescrever o método getRg() pq ele é final na classe Pessoa
    // public String getRg() {
    //     return null
    // }
}
