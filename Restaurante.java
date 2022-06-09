package com.company;


import java.util.Objects;

public class Restaurante {
    private String nombre;
    private String horario;
    private double precioMedio;

    public Restaurante(String nombre, String horario, double precioMedio) throws ExcepcionPropia {
        if( nombre== null) throw new ExcepcionPropia("Nombre del restaurante no valido");
        this.nombre = nombre;
        if( horario == null) throw new ExcepcionPropia("Horario del restaurante no valido");
        this.horario = horario;
        if( precioMedio <= 0.0) throw new ExcepcionPropia("Precio del restaurante medio no valido");
        this.precioMedio = precioMedio;
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

        Restaurante p = (Restaurante) ob;
        return Objects.equals(nombre, p.nombre) && p.horario == horario && p.precioMedio == precioMedio ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, horario, precioMedio);
    }

    @Override
    public String toString() {
        return "{" + nombre + ", " + horario +  ", " + precioMedio +  "}";
    }
}
