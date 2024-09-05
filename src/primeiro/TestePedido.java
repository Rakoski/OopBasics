package primeiro;

import java.util.Scanner;

public class TestePedido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pedido pedido1 = criarPedido(scanner, 1);
        Pedido pedido2 = criarPedido(scanner, 2);

        System.out.printf("Total do pedido 1: R$ %f\n", pedido1.calcularValorTotal());
        System.out.printf("Total do 2 pedido: R$ %f\n", pedido2.calcularValorTotal());
        System.out.printf("Total de todos os pedidos: R$ %f\n", Pedido.getTotalTodosPedidos());

        scanner.close();
    }

    private static Pedido criarPedido(Scanner scanner, int numeroPedido) {
        Pedido pedido = new Pedido(numeroPedido);

        pedido.setDataPedido(scanner.nextLine());
        pedido.setNomeProduto(scanner.nextLine());
        pedido.setPrecoUnitario(scanner.nextDouble());
        pedido.setQuantidade(scanner.nextInt());
        return pedido;
    }
}