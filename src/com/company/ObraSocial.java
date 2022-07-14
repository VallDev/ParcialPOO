package com.company;

import java.util.Date;

public class ObraSocial extends Paciente implements Comparable{

    private String nombreObraSocial;
    private int numeroAsociado;

    //se implementa el método constructor aunque el enunciado no lo especifica


    public ObraSocial(Date fechaNacimiento, String nombre, String apellido, boolean primeraConsulta, String nombreObraSocial, int numeroAsociado) {
        super();
        this.setFechaNacimiento(fechaNacimiento);
        this.setNombre(nombre);
        this.setPrimeraConsulta(primeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    @Override
    public int compareTo(Object o) {
        if (this.numeroAsociado<((ObraSocial)o).getNumeroAsociado()){
            return -1;
        } else if (this.numeroAsociado>((ObraSocial)o).getNumeroAsociado()){
                    return 1;
                } else {
                        return 0;
                    }
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public int getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(int numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }


}
