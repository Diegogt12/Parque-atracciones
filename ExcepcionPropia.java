package com.company;

public class ExcepcionPropia extends Exception{
    private String mes;

    public ExcepcionPropia(String mes) {
        super(mes);
    }
}
