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
        inventory.put("Galletas", 500);
        inventory.put("Jugo Natural", 3000);
    }

    private void showProducts() {
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void addProduct(String product, int quantity) {
        if(inventory.containsKey(product)) {
            products.add(new Product(product, quantity));
        }
    }

    public void checkout() {

        double subtotal = products.stream().mapToDouble(Product::getPrice).sum();
        double totalConDescuento = cliente.aplicarDescuento(subtotal);
        double descuento = subtotal - totalConDescuento;

        for (Product product : products) {
            System.out.println(product.toString() + product.getQuantity() + " unidades agregado al carrito.");
        }
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        products.forEach(p -> System.out.println("- " + p.getName() + " $" + p.getPrice()*p.getQuantity()));
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);
        System.out.println("------------------------");
    }
}
