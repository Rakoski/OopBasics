package br.edu.ifpr.palestra.teste;

import br.edu.ifpr.palestra.modelo.*;
import java.util.Date;

public class TesteGeral {
    public static void main(String[] args) {
        Sala sala = new Sala(100, "Lab 03", "Bloco 3");

        Palestrante palestrante = new Palestrante("Prof Marcelo", "123.456.789-01", "marcelo@gmail.com", "Endereço do IFPR, 321", "1234567", new Date(), "Paranavaí", "Paraná");

        Palestra palestra = new Palestra("Orientação a objetos", new Date(), true);

        Certificado certificado = new Certificado(1, 4, 1, 12345);

        Participante participante = new Participante("Mateus Rakoski", "mateusrakoski@gmail.com", "123.456.789-01");

        System.out.println("Capacidade: " + sala.getCapacidade());
        System.out.println("Nome: " + sala.getNome());
        System.out.println("Local: " + sala.getLocal());

        System.out.println("Palestrante:");
        System.out.println("Nome: " + palestrante.getNome());
        System.out.println("CPF: " + palestrante.getCPF());
        System.out.println("Email: " + palestrante.getEmail());
        System.out.println("Endereço: " + palestrante.getEndereco());
        System.out.println("Cidade nascimento: " + palestrante.getCidadeNascimento());
        System.out.println("Estado nascimento: " + palestrante.getEstadoNascimento());
        System.out.println("RG: " + palestrante.getRG());
        System.out.println("Data nascimento: " + palestrante.getDataNascimento());

        System.out.println("Palestra:");
        System.out.println("Tema: " + palestra.getTema());
        System.out.println("Data/Hora: " + palestra.getDataHora());
        System.out.println("Exige Frequência: " + (palestra.getExigeFrequencia() ? "sim" : "não"));

        System.out.println("Certificado:");
        System.out.println("Página: " + certificado.getPagina());
        System.out.println("Livro: " + certificado.getLivro());
        System.out.println("Folha: " + certificado.getFolha());
        System.out.println("Número: " + certificado.getNumeroDoCertificado());

        System.out.println("Participante:");
        System.out.println("Nome: " + participante.getNome());
        System.out.println("Email: " + participante.getEmail());
        System.out.println("CPF: " + participante.getCPF());
    }
}