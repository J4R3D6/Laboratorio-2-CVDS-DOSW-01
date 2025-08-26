package edu.dosw.lab.Creacionales.reto3;
public class Used extends DecoratorCategory{
    public Used(Vehicle v) { super(v); }
    @Override
    public String getName() { return vehicle.getName() + " Used"; }
    @Override
    public double getPrice() { return vehicle.getPrice() * 0.7; }
    @Override
    public String getEquipment() { return vehicle.getEquipment() + " (worn out)"; }
}
