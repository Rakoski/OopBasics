public class Livro {
    public String titulo;
    public String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibeDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }


}
