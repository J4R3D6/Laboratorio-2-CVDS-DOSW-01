package edu.dosw.lab.Comportamentales.reto1;

public class FrequentClient implements Discount{
    @Override
    public double applyDiscount(double total) {
        return total * 0.90; // 10% de descuento
    }

}
