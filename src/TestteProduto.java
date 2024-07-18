public class TestteProduto {


    public static void main(String[] args) {
        Produto produto = new Produto(1, "caneta", 1.50, 100);
        System.out.println("valor do estoque: " + produto.calcularValorEstoque());
        produto.adicionarEstoque(50);
        double calcularValorEstoque = produto.calcularValorEstoque();
        System.out.println("valor do estoque: " + calcularValorEstoque);
    }

}
