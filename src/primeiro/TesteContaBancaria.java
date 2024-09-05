package primeiro;

import java.util.Scanner;

public class TesteContaBancaria {

    public static void main(String[] args) {
        // valor venal??
        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        double saldo = Double.parseDouble(scanner.nextLine());

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        conta.imprimirDados();
    }
}
