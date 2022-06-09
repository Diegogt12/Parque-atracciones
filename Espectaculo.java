package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Espectaculo {
    private String nombre;
    private String tipo;
    private int minutos;
    private ArrayList<Pase> pases;

    public Espectaculo(String nombre, String tipo, int minutos) throws ExcepcionPropia {
        if( nombre== null) throw new ExcepcionPropia("Nombre no valido");
        this.nombre = nombre;
        if( tipo== null) throw new ExcepcionPropia("Tipo no valido");
        if(( tipo != "magia")&& (tipo != "danza") && ( tipo != "acrobacias")) throw new ExcepcionPropia("Tipo espectaculo no existe");
        this.tipo = tipo;
        if( minutos <= 0) throw new ExcepcionPropia("Minutos no valido");
        this.minutos = minutos;
    }

    public Espectaculo(String nombre, String tipo, int minutos, ArrayList<Pase> pases) throws ExcepcionPropia {
        if( nombre== null) throw new ExcepcionPropia("Nombre no valido");
        this.nombre = nombre;
        if( tipo== null) throw new ExcepcionPropia("Tipo no valido");
        if(( tipo != "magia")&& (tipo != "danza") && ( tipo != "acrobacias")) throw new ExcepcionPropia("Tipo espectaculo no existe");
        this.tipo = tipo;
        if( minutos <= 0) throw new ExcepcionPropia("Minutos no valido");
        this.minutos = minutos;
        if (pases != null) this.pases =pases;
        else this.pases = new ArrayList();
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

        Espectaculo p = (Espectaculo) ob;
        return Objects.equals(nombre, p.nombre) && p.tipo == tipo && p.minutos == minutos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, minutos);
    }

    @Override
    public String toString() {
        return "{" + nombre + ", " + tipo +  ", " + minutos +   "}";
    }
}
