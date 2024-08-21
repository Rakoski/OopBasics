public class Imovel {
        String endereco;
        double valorVenal;
        double valorVenda;
        final double constante = 10;

        public Imovel(String endereco, double valorVenal) {
            this.endereco = endereco;
            this.valorVenal = valorVenal;
            this.valorVenda = calculaValorVenda();
        }

        public double calculaValorVenda() {
            return this.valorVenal + this.constante;
        }

        public void imprimirDados() {
            System.out.println("Endereço: " + this.endereco);
            System.out.println("Valor Venda: " + this.valorVenal);
            System.out.println("Valor Venda: " + this.valorVenda);
        }
}
