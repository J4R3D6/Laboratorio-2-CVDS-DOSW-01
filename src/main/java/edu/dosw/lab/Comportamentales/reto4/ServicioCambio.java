package edu.dosw.lab.Comportamentales.reto4;

import java.util.*;

public class ServicioCambio {

    public static void ejecutar() {
        TasaCambio tasaCambio = new TasaCambioReal();
        List<Transaccion> transacciones = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de transacciones: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("--- Transacción " + i + " ---");

            System.out.print("Ingrese monto: ");
            double monto = Double.parseDouble(sc.nextLine());

            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP) : ");
            String origenStr = sc.nextLine().toUpperCase();
            Moneda origen = new Moneda(origenStr, origenStr);

            System.out.print("Ingrese monedas destino (separadas por coma o espacio, ej: USD, JPY) : ");
            String[] destinosStr = sc.nextLine().toUpperCase().split("[,\\s]+");

            Transaccion t = new Transaccion(monto, origen);
            for (String dest : destinosStr) {
                Moneda destino = new Moneda(dest.trim(), dest.trim());
                double convertido = tasaCambio.convertir(monto, origen, destino);
                t.agregarConversion(destino, convertido);
            }
            transacciones.add(t);
        }

        Map<String, Double> totales = new HashMap<>();
        int idx = 1;
        for (Transaccion t : transacciones) {
            System.out.println("Transacción " + idx + ": " + t.getCantidadOriginal() + " " + t.getOrigen().getSimbolo());
            t.getConversiones().forEach((moneda, valor) -> {
                System.out.println(String.format("Convertido a %s: %.2f %s",
                        moneda.getSimbolo(), valor, moneda.getSimbolo()));
                totales.merge(moneda.getSimbolo(), valor, Double::sum);
            });
            idx++;
        }

        System.out.println("--- Totales por moneda ---");
        totales.forEach((moneda, valor) -> System.out.println(String.format("%s: %.2f %s", moneda, valor, moneda)));
    }
}

