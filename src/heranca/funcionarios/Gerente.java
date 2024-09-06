package heranca.funcionarios;

public final class Gerente extends Funcionario {
    protected String departamento;

    protected Gerente(String nome, String dataNascimento) {
        super(nome, dataNascimento, 40);
    }

    protected String getDepartamento() {
        return departamento;
    }

    protected void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
