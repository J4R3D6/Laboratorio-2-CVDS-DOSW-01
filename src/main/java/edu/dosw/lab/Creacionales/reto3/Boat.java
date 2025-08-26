package edu.dosw.lab.Creacionales.reto3;
public class Boat implements Vehicle{
    @Override
    public String getName() {
        return "Boat";
    }

    @Override
    public double getPrice() {
        return 200000;
    }

    @Override
    public double getMaximumSpeed() {
        return 115;
    }

    @Override
    public String getEquipment() {
        return "Seating";
    }
}
