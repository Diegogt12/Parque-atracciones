package com.company;


public class Ticket {
    private String Fecha;
    private float precio;
    private Cliente cliente;

    public Ticket(String fecha, float precio, Cliente cliente) throws ExcepcionPropia {
        if( fecha == null) throw new ExcepcionPropia("Fecha del ticket no valida");
        Fecha = fecha;
        if( precio <= 0.0f) throw new ExcepcionPropia("Precio del ticket no valido");
        this.precio = precio;
        if( cliente == null) throw new ExcepcionPropia("Nombre ticket no valido");
        this.cliente = cliente;
    }
}
