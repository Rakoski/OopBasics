package heranca.funcionarios;


public final class Secretario extends Funcionario {
    private String telefone;

    public Secretario(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "telefone='" + telefone + '\'' +
                '}';
    }
}
