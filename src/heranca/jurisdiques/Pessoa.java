package heranca.jurisdiques;

public abstract class Pessoa {
    private String nome;
    private String rg;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public final String getRg() {
        return rg;
    }
}
