package edu.dosw.lab.Comportamentales.reto1;

class NewCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total * 0.95; // 5% descuento
    }
}
