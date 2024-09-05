package heranca.funcionarios;

public final class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
