package heranca.funcionarios;


public final class Secretario extends Funcionario {
    protected String telefone;

    protected Secretario(String nome, String dataNascimento) {
        super(nome, dataNascimento, 35);
    }

    protected String getTelefone() {
        return telefone;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "telefone='" + telefone + '\'' +
                '}';
    }
}
