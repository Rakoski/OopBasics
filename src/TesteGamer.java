import java.util.Scanner;

public class TesteGamer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        scanner.nextLine();
        String plataforma = scanner.nextLine();
        Gamer gamer = cadastrarGamer(nome, idade, plataforma);
        listarValores(gamer);
        Gamer gamerAtualizado = atualizarGamer(gamer, "Mateus", 20, "PC");
        removerGamer(gamerAtualizado);
        removerGamer(gamer);
    }

    public static Gamer cadastrarGamer(String nome, int idade, String plataforma) {
        return new Gamer(nome, idade, plataforma);
    }

    public static void listarValores(Gamer gamer) {
        System.out.println("Nome: " + gamer.getNome());
        System.out.println("Idade: " + gamer.getIdade());
        System.out.println("Plataforma: " + gamer.getPlataforma());
    }

    public static Gamer atualizarGamer(Gamer gamer, String nome, int idade, String plataforma) {
        gamer.setNome(nome);
        gamer.setIdade(idade);
        gamer.setPlataforma(plataforma);
        return gamer;
    }

    public static void removerGamer(Gamer gamer) {
        gamer.setNome(null);
        gamer.setIdade(0);
        gamer.setPlataforma(null);
    }

}
