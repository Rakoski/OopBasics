import pizzaria.com.pizza.modelo.Endereco;
import pizzaria.com.pizza.modelo.Pizzaiolo;

public class Main {
    public static void main(String[] args) {
        Pizzaiolo pizzaiolo = new Pizzaiolo();
        Endereco e = pizzaiolo.getEndereco();
        e.getCep();

        pizzaiolo.getEndereco().getCep();
    }
}