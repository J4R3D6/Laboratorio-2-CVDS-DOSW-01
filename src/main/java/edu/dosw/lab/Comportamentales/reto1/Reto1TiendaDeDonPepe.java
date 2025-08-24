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
        Client cliente = ClienteFactory.crearCliente(tipoCliente);
        ShoppingCart cart = new ShoppingCart(cliente);
        startcart(cart);
    }

    private static void startcart(ShoppingCart cart){
        System.out.println("Ingrese su compra:");
        Scanner scp = new Scanner(System.in);

        while (scp.hasNextLine()) {
            String line = scp.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split("\\s+");
            String productName = String.join(" ", Arrays.copyOf(parts, parts.length - 1));
            int quantity = Integer.parseInt(parts[parts.length - 1]);
            cart.addProduct(productName, quantity);
        }
        cart.checkout();
    }

}
