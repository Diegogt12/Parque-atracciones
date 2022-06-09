package com.company;

public class Cliente {
    private String nombre;
    private String apellidos;
    

    public Cliente(String nombre, String apellidos) throws ExcepcionPropia {
        if( nombre== null) throw new ExcepcionPropia("Nombre no valido");
        this.nombre = nombre;
        if( apellidos == null) throw new ExcepcionPropia("Apellidos no validos");
        this.apellidos = apellidos;
    }
}
