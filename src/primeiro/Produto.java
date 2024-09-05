package primeiro;

public class Produto {
    int codigo;
    String descricao;
    double precoUnitario;
    int quantidadeEstoque;
    public Produto(int codigo, String descricao, double precoUnitario, int quantidadeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularValorEstoque() {
        return this.precoUnitario * this.quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }
}