package com.company;

import java.util.HashSet;
import java.util.Objects;


public class Pase {
    private String fecha;
    private int horaInicio;
    private int horaFin;
    private HashSet<Entrada> entradas;

    public Pase(String fecha, int horaInicio, int horaFin, HashSet<Entrada> entradas) throws ExcepcionPropia {
        if( fecha == null) throw new ExcepcionPropia("Fecha de pase no valida");
        this.fecha = fecha;
        if( horaInicio <= 0) throw new ExcepcionPropia("Hora de inicio del pase no valida");
        this.horaInicio = horaInicio;
        if( horaFin <= 0) throw new ExcepcionPropia("Hora de fin del pase no valida");
        this.horaFin = horaFin;
        if( entradas == null ) throw new ExcepcionPropia("Entradas del pase  no valida");
        if( entradas.isEmpty()) throw new ExcepcionPropia("No hay entradas en el pase");
        this.entradas = entradas;
    }

    @Override
    public boolean equals(Object ob)
    {
        if (ob == this) {
            return true;
        }

        if (ob == null || ob.getClass() != getClass()) {
            return false;
        }

        Pase p = (Pase) ob;
        return Objects.equals(fecha, p.fecha) && p.horaInicio == horaInicio && p.horaFin == horaFin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, horaInicio, horaFin);
    }

    @Override
    public String toString() {
        return "{" + fecha + ", " + horaInicio +  ", " + horaFin + "}";
    }
}
