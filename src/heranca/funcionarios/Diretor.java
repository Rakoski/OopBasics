package heranca.funcionarios;

public class Diretor extends Funcionario {

    private String naoaguentomaisdigitar;
    protected Diretor(String nome, String dataNascimento) {
        super(nome, dataNascimento, 45);
    }

}
