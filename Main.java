package com.company;
;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws ExcepcionPropia {
        HashSet<Atracción> atraccións = new HashSet<Atracción>();
        Atracción a = new Atracción("Tokito", 10,15,2);
        Atracción b = new Atracción("monster", 12, 3,4);
        atraccións.add(a);
        atraccións.add(b);

        HashSet<Restaurante> restaurantes = new HashSet<Restaurante>();
        Restaurante c =new Restaurante("McDonals", "10:30-21:00",7.5);
        restaurantes.add(c);

        ArrayList<Espectaculo> espectaculos = new ArrayList<Espectaculo>();
        Espectaculo d = new Espectaculo("Chaschas","magia",15);
        espectaculos.add(d);

        ZonaTematica z = new ZonaTematica("MiniLandia", "miniaventuras", "azul",atraccións, restaurantes,espectaculos);

        Cliente p = new Cliente("Pedro","Gutierrez");
        Ticket t = new Ticket("10-05", 20.00f,p);

        Entrada e = new Entrada(5,20.00f,"disponible", t);
        Entrada e2 = new Entrada(6,20.00f,"vendida");
        Entrada e3 = new Entrada(6,20.00f,"vendida");

        HashSet<Entrada> entradas = new HashSet<Entrada>();
        entradas.add(e);
        entradas.add(e2);
        entradas.add(e3);

        System.out.println(entradas);

        Pase pas = new Pase("10-05",20,21,entradas);
        ArrayList<Pase> pases = new ArrayList<Pase>();
        pases.add(pas);
        Espectaculo d2 = new Espectaculo("Jumpujump","danza",10,pases);

    }
}
