package edu.dosw.lab.Creacionales.reto2;

import java.util.List;
import java.util.stream.Collectors;

public class Hamburguesa {
    private List<Ingrediente> ingredientes;

    Hamburguesa(Builder builder) {
        this.ingredientes = builder.ingredientes;
    }

    public int calcularPrecio() {
        return ingredientes.stream()
                .mapToInt(Ingrediente::getPrecio)
                .sum();
    }

    @Override
    public String toString() {
        String listaIngredientes = ingredientes.stream()
                .map(Ingrediente::getNombre)
                .collect(Collectors.joining(", "));
        return "--- HAMBURGUESA PERSONALIZADA ---\n" +
                "Ingredientes seleccionados: " + listaIngredientes + "\n" +
                "Precio total: $" + calcularPrecio() + "\n\n" +
                "¡Disfrute su hamburguesa!";
    }
}


