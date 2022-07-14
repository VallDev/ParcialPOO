package com.company;

import java.util.Date;

public class Consulta {

    private Date fechaConsulta;
    private String especialdiad;
    private int hora;
    private int minuto;
    private Paciente paciente;

    public Consulta(Date fechaConsulta, String especialdiad, int hora, int minuto) {
        this.fechaConsulta = fechaConsulta;
        this.especialdiad = especialdiad;
        this.hora = hora;
        this.minuto = minuto;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getEspecialdiad() {
        return especialdiad;
    }

    public void setEspecialdiad(String especialdiad) {
        this.especialdiad = especialdiad;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
