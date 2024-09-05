package primeiro;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("324234243", "Arquitetura");
        System.out.println("RA:" + estudante.ra);
        System.out.println("Curso: " + estudante.curso);
    }
}
