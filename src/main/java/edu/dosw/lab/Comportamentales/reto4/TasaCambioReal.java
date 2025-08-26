package edu.dosw.lab.Comportamentales.reto4;

import java.util.HashMap;
import java.util.Map;

public class TasaCambioReal implements TasaCambio {

    private final Map<String, Double> tasas = new HashMap<>();

    public TasaCambioReal() {
        // Tasas ajustadas para coincidir con el ejemplo
        tasas.put("EUR-USD", 1.1);         // 50 EUR * 1.1 = 55 USD
        tasas.put("EUR-JPY", 165.0);       // 50 EUR * 165 = 8250 JPY
        tasas.put("COP-USD", 0.00025);     // 100000 COP * 0.00025 = 25 USD
        tasas.put("COP-EUR", 0.0002273);   // 100000 COP * 0.0002273 ≈ 22.73 EUR

        // Tasas para otras conversiones opcionales
        tasas.put("USD-EUR", 0.91);
        tasas.put("USD-JPY", 150.0);
        tasas.put("USD-COP", 4000.0);

        tasas.put("JPY-USD", 0.0067);
        tasas.put("JPY-EUR", 0.00606);
        tasas.put("JPY-COP", 30.0);

        tasas.put("EUR-COP", 5000.0);
        tasas.put("COP-JPY", 4400.0);

        // Conversiones a sí misma
        tasas.put("USD-USD", 1.0);
        tasas.put("EUR-EUR", 1.0);
        tasas.put("JPY-JPY", 1.0);
        tasas.put("COP-COP", 1.0);
    }

    @Override
    public double convertir(double cantidad, Moneda origen, Moneda destino) {
        String key = origen.getSimbolo() + "-" + destino.getSimbolo();
        return cantidad * tasas.getOrDefault(key, 1.0);
    }
}

