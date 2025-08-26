package edu.dosw.lab.Comportamentales.reto1;

class FrequentCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total * 0.90; // 10% descuento
    }
}
