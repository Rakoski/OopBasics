import java.util.Scanner;

public class Pedido {
    private int numeroPedido;
    private String dataPedido;
    private String nomeProduto;
    private double precoUnitario;
    private int quantidade;
    private static double totalTodosPedidos = 0;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularValorTotal() {
        double valorTotal = getPrecoUnitario() * getQuantidade();
        totalTodosPedidos += valorTotal;
        return valorTotal;
    }

    public static double getTotalTodosPedidos() {
        return totalTodosPedidos;
    }
}