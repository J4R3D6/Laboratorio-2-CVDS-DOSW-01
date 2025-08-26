package edu.dosw.lab.Creacionales.reto3;
public class Bicycle implements Vehicle{
    @Override
    public String getName() {
        return "Bicycle";
    }

    @Override
    public double getPrice() {
        return 1000;
    }

    @Override
    public double getMaximumSpeed() {
        return 60;
    }

    @Override
    public String getEquipment() {
        return "Guayas";
    }
}
