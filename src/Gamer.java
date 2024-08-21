public class Gamer {
      private String nome;
      private int idade;

      private String plataforma;

      public Gamer(String nome, int idade, String plataforma) {
          this.nome = nome;
          this.idade = idade;
          this.plataforma = plataforma;
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
