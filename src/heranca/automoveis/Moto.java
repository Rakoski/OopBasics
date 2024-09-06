package heranca.automoveis;

public class Moto extends Automovel {
    private String cilindradas;

    public Moto(String marca, String modelo, String cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

}
