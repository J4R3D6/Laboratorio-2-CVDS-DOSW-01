package edu.dosw.lab.Comportamentales.reto1;

import javax.swing.*;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la tienda Don Pepe!");
        System.out.print("Tipo de cliente: ");
        String tipoCliente = sc.nextLine().trim().toLowerCase();
        // Escoger la estrategia de descuento según el cliente
        Discount discount;
        if (tipoCliente.equalsIgnoreCase("nuevo")) {
            discount = new NewClient();
        } else if (tipoCliente.equalsIgnoreCase("frecuente")) {
            discount = new FrequentClient();
        } else {
            System.out.println("Tipo de cliente no válido, se usará sin descuento.");
            discount = total -> total; // lambda para "sin descuento"
        }

        ShoppingCart cart = new ShoppingCart(discount);
        cart.addProduct(new Product("Camiseta", 20000));
        cart.addProduct(new Product("Galletas", 500));
        cart.addProduct(new Product("Jugo", 3000));

        cart.checkout();
    }

}
