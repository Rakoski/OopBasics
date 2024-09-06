package heranca.automoveis;

public class Carro extends Automovel {
    private int quantidadePortas;
    public Carro(String marca, String modelo, int quantidadePortas, int quantidadeRodas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadePortas=" + quantidadePortas +
                '}';
    }
}
