package com.company;

import java.util.Date;

public class Particular extends Paciente {

    private double cobroConsulta;
    private int dni;

    //se implementa el método constructor aunque el enunciado no lo especifica

    public Particular(Date fechaNacimiento, String nombre, String apellido, boolean primeraConsulta, double cobroConsulta, int dni) {
        super();
        this.setFechaNacimiento(fechaNacimiento);
        this.setNombre(nombre);
        this.setPrimeraConsulta(primeraConsulta);
        this.cobroConsulta = cobroConsulta;
        this.dni = dni;
    }

    public double getCobroConsulta() {
        return cobroConsulta;
    }

    public void setCobroConsulta(double cobroConsulta) {
        this.cobroConsulta = cobroConsulta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
