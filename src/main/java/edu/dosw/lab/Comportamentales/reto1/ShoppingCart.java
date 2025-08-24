package edu.dosw.lab.Comportamentales.reto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private Client cliente;
    private HashMap<String, Integer> inventory = new HashMap<>();

    public ShoppingCart(Client cliente) {
        this.cliente = cliente;
        this.createInventory();
        this.showProducts();
    }

    private void createInventory() {
        inventory.put("Camiseta", 20000);
        inventory.put("Pantalon", 50000);
        inventory.put("Galletas", 500);
        inventory.put("Jugo Natural", 3000);
    }

    private void showProducts() {
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void addProduct(String productName, int quantity) {
        String key = String.valueOf(productName.charAt(0)).toUpperCase() + productName.substring(1);
        if(inventory.containsKey(key)) {
            if(checkInList(productName)) {
                for (Product product : products) {
                    if(product.getName().equalsIgnoreCase(productName)) {
                        product.addProduct(quantity);
                    }
                }
            }else {
                Product product = new Product(productName, inventory.get(key));
                product.addProduct(quantity);
                products.add(product);
            }
        }
    }

    private boolean checkInList(String productName) {
        for (Product product : products) {
            if(product.getName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void checkout() {

        double subtotal = products.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
        double totalConDescuento = cliente.aplicarDescuento(subtotal);
        double descuento = subtotal - totalConDescuento;

        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getQuantity() + " unidades agregado al carrito.");
        }
        System.out.println("--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        products.forEach(p -> System.out.println("  - " + p.getName() + " $" + p.getPrice()*p.getQuantity()));
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
