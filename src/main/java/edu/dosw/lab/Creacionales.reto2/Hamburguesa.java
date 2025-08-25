package edu.dosw.lab.Creacionales.reto2;

import java.util.List;
import java.util.stream.Collectors;

public class Hamburguesa {
    private final List<String> ingredientes;

    Hamburguesa(Builder builder) {
        this.ingredientes = builder.ingredientes;
    }

    @Override
    public String toString() {
        String lista = ingredientes.stream().collect(Collectors.joining(", "));
        return "Hamburguesa con: " + lista;
    }
}


