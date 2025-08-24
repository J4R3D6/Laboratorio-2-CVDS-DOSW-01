package edu.dosw.lab.Comportamentales.reto1;


class Client {
    private String tipo;
    private DiscountStrategy discount;

    public Client(String tipo, DiscountStrategy discount) {
        this.tipo = tipo;
        this.discount = discount;
    }

    public double aplicarDescuento(double subtotal) {
        return discount.applyDiscount(subtotal);
    }

    public String getTipo() {
        return tipo;
    }
}
