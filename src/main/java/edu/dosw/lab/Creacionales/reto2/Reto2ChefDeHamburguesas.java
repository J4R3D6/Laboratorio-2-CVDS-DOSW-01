package edu.dosw.lab.Creacionales.reto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reto2ChefDeHamburguesas {


        public static void ejecutar() {
            Scanner sc = new Scanner(System.in);
            List<Ingrediente> ingredientesDisponibles = new ArrayList<>(Arrays.asList(
                    new Ingrediente("Pan", 3000),
                    new Ingrediente("Carne", 10000),
                    new Ingrediente("Queso", 5000),
                    new Ingrediente("Lechuga", 2000),
                    new Ingrediente("Tomate", 2200),
                    new Ingrediente("Salsa especial", 3000)
            ));

            System.out.println("Seleccione ingredientes para su hamburguesa:");
            for (int i = 0; i < ingredientesDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + ingredientesDisponibles.get(i));
            }
            System.out.println((ingredientesDisponibles.size() + 1) + ". Agregar un nuevo ingrediente");

            System.out.print("\nIngrese los números separados por coma: ");
            String[] seleccion = sc.nextLine().split(",");

            Builder builder = new Builder();

            for (String opcion : seleccion) {
                int idx = Integer.parseInt(opcion.trim()) - 1;
                if (idx >= 0 && idx < ingredientesDisponibles.size()) {
                    builder.agregarIngrediente(ingredientesDisponibles.get(idx));
                } else if (idx == ingredientesDisponibles.size()) {
                    System.out.print("Ingrese el nombre del nuevo ingrediente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el precio del ingrediente: ");
                    int precio = sc.nextInt();
                    sc.nextLine();
                    Ingrediente nuevo = new Ingrediente(nombre, precio);
                    builder.agregarIngrediente(nuevo);
                }
            }

            Hamburguesa hamburguesa = builder.build();
            System.out.println("\n" + hamburguesa);

            sc.close();
        }
    }


