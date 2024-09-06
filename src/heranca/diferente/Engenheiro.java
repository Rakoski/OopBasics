package heranca.diferente;

import heranca.funcionarios.Funcionario;

public class Engenheiro extends Funcionario {
    String nome;

    protected Engenheiro(String nome, String dataNascimento) {
        super(nome, dataNascimento, 40);
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    //nao da pra pegar os outros metodos se tiverem usando default, ainda mais pq só da pra usar em interface

    @Override
    public String toString() {
        return "Engenheiro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
