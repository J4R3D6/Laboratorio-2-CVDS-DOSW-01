package edu.dosw.lab.Comportamentales.reto1;

import java.util.Arrays;
import java.util.Scanner;

public class Reto1TiendaDeDonPepe {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la tienda Don Pepe!");
        System.out.print("Tipo de cliente: ");
        String tipoCliente = sc.nextLine().trim().toLowerCase();
        // Escoger la estrategia de descuento según el cliente
        Client cliente;
        try {
            cliente = ClienteFactory.crearCliente(tipoCliente);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            cliente = ClienteFactory.crearCliente("nuevo");
        }
        ShoppingCart cart = new ShoppingCart(cliente);
        startcart(cart);
    }

    private static void startcart(ShoppingCart cart){
        System.out.println("Ingrese su compra de la siguente forma: Elemento:cantidad");
        Scanner scp = new Scanner(System.in);

        while (scp.hasNextLine()) {
            String line = scp.nextLine().trim();
            if (line.isEmpty()) break;

            // Separar por ":"
            String[] parts = line.split(":");

            if (parts.length == 2) {
                String productName = parts[0].trim();
                int quantity = Integer.parseInt(parts[1].trim());

                cart.addProduct(productName, quantity);
            } else {
                System.out.println("Formato inválido: " + line);
            }
        }

        cart.checkout();
    }

}
