package edu.dosw.lab.Creacionales.reto2;

import java.util.Scanner;

public class Reto2ChefDeHamburguesas {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Builder builder = new Builder();

        System.out.println("Vamos a armar tu hamburguesa personalizada:\n");

        // Selección de pan
        System.out.print("Elige tu pan (Integral, Blanco, Ajonjolí): ");
        String pan = sc.nextLine();
        builder.conPan(pan);

        // Selección de carne
        System.out.print("Elige tu carne (Res, Pollo, Vegana, Doble carne de res): ");
        String carne = sc.nextLine();
        builder.conCarne(carne);

        // Selección de queso
        System.out.print("Elige tu queso (Cheddar, Mozzarella, Suizo, Ninguno): ");
        String queso = sc.nextLine();
        if (!queso.equalsIgnoreCase("Ninguno")) {
            builder.conQueso(queso);
        }

        // Vegetales
        while (true) {
            System.out.print("Agrega un vegetal (Lechuga, Tomate, Cebolla, Pepinillos) o escribe 'no' para continuar: ");
            String vegetal = sc.nextLine();
            if (vegetal.equalsIgnoreCase("no")) break;
            builder.conVegetal(vegetal);
        }

        // Salsas
        while (true) {
            System.out.print("Agrega una salsa (BBQ, Mayonesa, Mostaza, Ketchup) o escribe 'no' para continuar: ");
            String salsa = sc.nextLine();
            if (salsa.equalsIgnoreCase("no")) break;
            builder.conSalsa(salsa);
        }

        // Extras
        while (true) {
            System.out.print("Agrega un extra (Tocineta, Extra queso, Huevo, Ninguno) o escribe 'no' para continuar: ");
            String extra = sc.nextLine();
            if (extra.equalsIgnoreCase("no")) break;
            builder.conExtra(extra);
        }

        // Construcción final
        Hamburguesa personalizada = builder.build();
        System.out.println(personalizada);
    }
}

