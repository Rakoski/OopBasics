package br.edu.ifpr.palestra.modelo;

import java.util.Date;

public class Palestra {
    private String tema;
    private Date dataHora;
    private boolean exigeFrequencia;

    public Palestra(String tema, Date dataHora, boolean exigeFrequencia) {
        this.tema = tema;
        this.dataHora = dataHora;
        this.exigeFrequencia = exigeFrequencia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public boolean getExigeFrequencia() {
        return exigeFrequencia;
    }

    public void setExigeFrequencia(boolean exigeFrequencia) {
        this.exigeFrequencia = exigeFrequencia;
    }
}