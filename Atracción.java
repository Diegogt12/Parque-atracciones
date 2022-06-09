package com.company;

import java.util.Objects;

public class Atracción {
    private String nombre;
    private int estatura;
    private int capacidad;
    private int duracion;

    public Atracción(String nombre, int estatura, int capacidad, int duracion) throws ExcepcionPropia {
        if( nombre== null) throw new ExcepcionPropia("Nombre de la atraccion no valido");
        this.nombre = nombre;
        if( estatura <= 0) throw new ExcepcionPropia("Estatura de la atraccion no valido");
        this.estatura = estatura;
        if( capacidad <= 0) throw new ExcepcionPropia("Capacidad de la atraccion no valido");
        this.capacidad = capacidad;
        if( duracion <= 0) throw new ExcepcionPropia("Duracion de la atraccion no valido");
        this.duracion = duracion;
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

        Atracción p = (Atracción) ob;
        return Objects.equals(nombre, p.nombre) && p.estatura == estatura && p.capacidad == capacidad && p.duracion == duracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, estatura, capacidad, duracion);
    }

    @Override
    public String toString() {
        return "{" + nombre + ", " + estatura +  ", " + capacidad +  ", " + duracion + "}";
    }
}
