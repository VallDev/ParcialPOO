package com.company;

import java.util.Date;

public abstract class Paciente {

    private Date fechaNacimiento;
    private String nombre;
    private String apellido;
    private  boolean primeraConsulta;

    //No se implementa método constructor ya que se trata de una clase abstracta

    public boolean evaluacionInicial(){
        return this.primeraConsulta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isPrimeraConsulta() {
        return primeraConsulta;
    }

    public void setPrimeraConsulta(boolean primeraConsulta) {
        this.primeraConsulta = primeraConsulta;
    }
}
