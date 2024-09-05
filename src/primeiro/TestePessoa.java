package primeiro;

import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[1];

        for (int i = 0; i < pessoas.length; i++) {
            int diaNascimento = scanner.nextInt();
            int mesNascimento = scanner.nextInt();
            int anoNascimento = scanner.nextInt();
            pessoas[i] = new Pessoa(diaNascimento, mesNascimento, anoNascimento);
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println("Dia que nasceu: " + pessoa.diaNascimento);
            System.out.println("Mes que nasceu: " + pessoa.mesNascimento);
            System.out.println("Ano que nasceu: " + pessoa.anoNascimento);
            System.out.println("Idade: " + pessoa.idade);
        }
    }
}
