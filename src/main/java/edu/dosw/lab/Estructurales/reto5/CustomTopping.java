package edu.dosw.lab.Estructurales.reto5;

public class CustomTopping extends CoffeeDecorator {
    private String name;
    private double price;

    public CustomTopping(Coffee coffee, String name, double price) {
        super(coffee);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + name;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + price;
    }
}
