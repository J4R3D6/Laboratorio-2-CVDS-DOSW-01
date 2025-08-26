package edu.dosw.lab.Comportamentales.reto4;

public class Moneda {
    private final String nombre;
    private final String simbolo;

    public Moneda(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
