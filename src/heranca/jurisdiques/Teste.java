package heranca.jurisdiques;
public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João Silva");
        funcionario.setRg("12345678-9");
        funcionario.setNumeroCartao("123456");

        System.out.println("Classe do objeto: " + funcionario.getClass().getName());

        Pessoa pessoa = new PessoaFIsica();
        pessoa.setNome("Maria Oliveira");
        funcionario.setNome(pessoa.getNome());
        System.out.println("Nome do funcionário: " + funcionario.getNome());

    }
}
