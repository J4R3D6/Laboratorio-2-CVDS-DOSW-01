package edu.dosw.lab.Comportamentales.reto1;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public void addProduct(int quantity) { this.quantity = this.quantity + quantity; }
}
