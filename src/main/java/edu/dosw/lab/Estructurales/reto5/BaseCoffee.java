package edu.dosw.lab.Estructurales.reto5;

public class BaseCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Base Coffee";
    }
    @Override
    public double getCost() {
        return 3000;
    }
}