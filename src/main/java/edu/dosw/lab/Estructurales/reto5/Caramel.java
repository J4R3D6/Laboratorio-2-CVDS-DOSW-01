package edu.dosw.lab.Estructurales.reto5;

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Caramel";
    }
    @Override
    public double getCost() {
        return coffee.getCost() + 2000;
    }
}