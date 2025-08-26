package edu.dosw.lab.Comportamentales.reto4;

import java.util.HashMap;
import java.util.Map;

public class Transaccion {
    private final double cantidadOriginal;
    private final Moneda origen;
    private final Map<Moneda, Double> conversiones = new HashMap<>();

    public Transaccion(double cantidadOriginal, Moneda origen) {
        this.cantidadOriginal = cantidadOriginal;
        this.origen = origen;
    }

    public void agregarConversion(Moneda destino, double cantidadConvertida) {
        conversiones.put(destino, cantidadConvertida);
    }

    public double getCantidadOriginal() {
        return cantidadOriginal;
    }

    public Moneda getOrigen() {
        return origen;
    }

    public Map<Moneda, Double> getConversiones() {
        return conversiones;
    }
}
