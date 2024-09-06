package heranca.automoveis;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    private static ArrayList<Automovel> automoveis = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===Menu===");
            System.out.println("1. Inserir novo automóvel");
            System.out.println("2. Visualizar automóveis");
            System.out.println("3. Excluir automóvel");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserirAutomovel();
                    break;
                case 2:
                    visualizarAutomoveis();
                    break;
                case 3:
                    excluirAutomovel();
                    break;
                case 4:
                    System.out.println("Saindo da aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void inserirAutomovel() {
        System.out.print("Digite 1 para Carro ou 2 para Moto (inserindp)");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        if (tipo == 1) {
            int quantidadePortas = scanner.nextInt();
            automoveis.add(new Carro(marca, modelo, quantidadePortas, 4));
        } else if (tipo == 2) {
            String cilindradas = scanner.nextLine();
            automoveis.add(new Moto(marca, modelo, cilindradas));
        }

        System.out.println("Automóvel inserid");
    }

    private static void visualizarAutomoveis() {
        System.out.println("\nAutomóveis:");
            for (int i = 0; i < automoveis.size(); i++) {
                Automovel auto = automoveis.get(i);
                System.out.println(i + ": " + auto.getClass().getSimpleName() + " - " + auto);
        }
    }

    private static void excluirAutomovel() {
        visualizarAutomoveis();
            System.out.print("Digite o índice do automóvel a ser excluído: ");
            int indice = scanner.nextInt();
                automoveis.remove(indice);
                System.out.println("Automóvel excluído");

    }
}