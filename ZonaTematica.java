package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class ZonaTematica {
    private String nombre;
    private String descripcion;
    private String color;
    private HashSet<Atracción> atraciones;
    private HashSet<Restaurante> restaurantes;
    private ArrayList<Espectaculo> espectaculos;

    public ZonaTematica(String nombre, String descripcion, String color, HashSet<Atracción> atraciones, HashSet<Restaurante> restaurantes, ArrayList<Espectaculo> espectaculos) throws ExcepcionPropia {
        if( nombre== null) throw new ExcepcionPropia("Nombre de la zona tematica no valido");
        this.nombre = nombre;
        if( descripcion== null) throw new ExcepcionPropia("Descripcion de la zona tematica no valida");
        this.descripcion = descripcion;
        if( color == null) throw new ExcepcionPropia("Color de la zona tematica no valido");
        this.color = color;
        if( atraciones == null) throw new ExcepcionPropia("atraciones de la zona tematica no validas");
        if( atraciones.isEmpty()) throw new ExcepcionPropia("No hay atracciones en la zona tematica");
        this.atraciones = atraciones;
        if( restaurantes == null) throw new ExcepcionPropia("restaurantes de la zona tematica no validas");
        if( restaurantes.isEmpty()) throw new ExcepcionPropia("No hay restaurantes en la zona tematica");
        this.restaurantes = restaurantes;
        if( espectaculos == null) throw new ExcepcionPropia("espectaculos no validas en la zona tematica");
        if( espectaculos.isEmpty()) throw new ExcepcionPropia("No hay espectaculos en la zona tematica");
        this.espectaculos = espectaculos;
    }
}
