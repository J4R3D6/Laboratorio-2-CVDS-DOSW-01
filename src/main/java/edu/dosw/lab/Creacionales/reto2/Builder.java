package edu.dosw.lab.Creacionales.reto2;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    List<String> ingredientes = new ArrayList<>();

    public Builder conPan(String pan) {
        ingredientes.add("Pan: " + pan+"\n");
        return this;
    }

    public Builder conCarne(String carne) {
        ingredientes.add("Carne: " + carne+"\n");
        return this;
    }

    public Builder conQueso(String queso) {
        ingredientes.add("Queso: " + queso+"\n");
        return this;
    }

    public Builder conVegetal(String vegetal) {
        ingredientes.add("Vegetal: " + vegetal+"\n");
        return this;
    }

    public Builder conSalsa(String salsa) {
        ingredientes.add("Salsa: " + salsa+"\n");
        return this;
    }

    public Builder conExtra(String extra) {
        ingredientes.add("Extra: " + extra +"\n");
        return this;
    }

    public Hamburguesa build() {
        return new Hamburguesa(this);
    }
}
