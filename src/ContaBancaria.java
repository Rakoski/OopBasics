public class ContaBancaria {
    public String numeroConta;
    public String nomeTitular;
    public double saldo;
    public double taxaDeJuros;

    public ContaBancaria(String numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.taxaDeJuros = valorTaxaJuros();
    }

    public double valorTaxaJuros() {
        int taxa;
        if (this.saldo > 100000) {
            taxa = 5;
        } else if (this.saldo < 50000) {
            taxa = 10;
        } else {
            taxa = 15;
        }
        return taxa;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void imprimirDados() {
        System.out.println("Valores do número da conta: " + this.numeroConta);
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Taxa de Juros: " + this.taxaDeJuros);
    }
}
