package primeiro;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Pessoa {
    public int diaNascimento;
    public int mesNascimento;
    public int anoNascimento;
    public int idade;

    public Pessoa(int diaNascimento, int mesNascimento, int anoNascimento) {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.idade = calcularIdade(diaNascimento, mesNascimento, anoNascimento);
    }

    private int calcularIdade(int dia, int mes, int ano) {
        Date date = new Date();


        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        int idade = Period.between(dataNascimento, localDate).getYears();
        return idade;
    }
}
