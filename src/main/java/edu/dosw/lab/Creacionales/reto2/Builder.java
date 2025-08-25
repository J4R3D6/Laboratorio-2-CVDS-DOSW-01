package edu.dosw.lab.Creacionales.reto2;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    List<Ingrediente> ingredientes = new ArrayList<>();

    public Builder agregarIngrediente(Ingrediente ing) {
        ingredientes.add(ing);
        return this;
    }

    public Hamburguesa build() {
        return new Hamburguesa(this);
    }
}

