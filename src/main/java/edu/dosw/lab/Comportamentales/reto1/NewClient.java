package edu.dosw.lab.Comportamentales.reto1;

public class NewClient implements Discount{
    @Override
    public double applyDiscount(double total) {
        return total * 0.95; // 5% de descuento
    }
}
