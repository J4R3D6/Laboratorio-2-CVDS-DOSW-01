package edu.dosw.lab.Creacionales.reto3;
public class Economic extends DecoratorCategory{
    public Economic(Vehicle v) { super(v); }
    @Override
    public String getName() { return vehicle.getName() + " económic"; }
    @Override
    public double getPrice() { return vehicle.getPrice() * 0.9; }
    @Override
    public String getEquipment() { return vehicle.getEquipment() + " (básic)"; }
}
