package com.company;


import java.util.Objects;

public class Entrada {
    private int asiento;
    private float precio;
    private String estadoEntrada;
    private Ticket ticket;
    public Entrada(int asiento, float precio, String estadoEntrada) throws ExcepcionPropia {
        if( asiento <= 0 ) throw new ExcepcionPropia("asiento de la entrada no valida");
        this.asiento = asiento;
        if( precio <= 0.0f ) throw new ExcepcionPropia("Precio de la entrada no valida");
        this.precio = precio;
        if( estadoEntrada == null) throw new ExcepcionPropia("Estado de la entrada no valida");
        if(( estadoEntrada != "vendida") && (estadoEntrada != "disponible")) throw new ExcepcionPropia("Estado de la entrada no disponible");
        this.estadoEntrada = estadoEntrada;
    }
    public Entrada(int asiento, float precio, String estadoEntrada, Ticket ticket) throws ExcepcionPropia {
        if( asiento <= 0 ) throw new ExcepcionPropia("asiento de la entrada no valida");
        this.asiento = asiento;
        if( precio <= 0.0f ) throw new ExcepcionPropia("Precio de la entrada no valida");
        this.precio = precio;
        if( estadoEntrada == null) throw new ExcepcionPropia("Estado de la entrada no valida");
        if(( estadoEntrada != "vendida") && (estadoEntrada != "disponible")) throw new ExcepcionPropia("Estado de la entrada no disponible");
        this.estadoEntrada = estadoEntrada;
        if(ticket == null ) throw new ExcepcionPropia("Ticket de la entrada no valido");
        this.ticket = ticket;
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

        Entrada p = (Entrada) ob;
        return Objects.equals(asiento, p.asiento) && p.precio == precio && p.estadoEntrada == estadoEntrada;
    }

    @Override
    public int hashCode() {
        return Objects.hash(asiento, precio,estadoEntrada);
    }

    @Override
    public String toString() {
        return "{" + asiento + ", " + precio +  ", " + estadoEntrada + "}";
    }
}
