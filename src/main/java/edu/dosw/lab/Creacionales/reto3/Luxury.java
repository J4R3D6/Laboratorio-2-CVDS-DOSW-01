package edu.dosw.lab.Creacionales.reto3;
public class Luxury extends DecoratorCategory{
    public Luxury(Vehicle v) { super(v); }
    @Override
    public String getName() { return vehicle.getName() + " deluxe"; }
    @Override
    public double getPrice() { return vehicle.getPrice() * 1.5; }
    @Override
    public String getEquipment() { return vehicle.getEquipment() + " + premium upholstery"; }
}
