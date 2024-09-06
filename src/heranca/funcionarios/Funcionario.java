package heranca.funcionarios;

public class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected int salario;

    protected Funcionario(String nome, String dataNascimento, int quantidadeDeHorasTrabalhadas) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = calculaSalario(quantidadeDeHorasTrabalhadas);
    }

    protected int calculaSalario(int quantidadeDeHorasTrabalhadas) {
        return salario + quantidadeDeHorasTrabalhadas;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getDataNascimento() {
        return dataNascimento;
    }

    protected void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

}
