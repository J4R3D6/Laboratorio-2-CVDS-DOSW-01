package edu.dosw.lab.Comportamentales.reto1;

import java.util.ArrayList;
import java.util.*;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private Discount discount;

    public ShoppingCart(Discount discount) {

        this.discount = discount;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void checkout() {
        double subtotal = products.stream().mapToDouble(Product::getPrice).sum();
        double total = discount.applyDiscount(subtotal);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total con descuento: $" + total);
    }
}
