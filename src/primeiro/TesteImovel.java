package primeiro;

import java.util.Scanner;

public class TesteImovel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Endereço:");
        String enderecoScanner = scanner.nextLine();
        System.out.println("Valor venal:");
        double valorVendalScanner = scanner.nextDouble();

        Imovel imovel = new Imovel(enderecoScanner, valorVendalScanner);
        imovel.imprimirDados();

        scanner.close();
    }
}
