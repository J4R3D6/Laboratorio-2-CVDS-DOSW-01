package edu.dosw.lab.Creacionales.reto3;
public class SmallPlane implements Vehicle {
    @Override
    public String getName() {
        return "Small Plane";
    }

    @Override
    public double getPrice() {
        return 400000;
    }

    @Override
    public double getMaximumSpeed() {
        return 260;
    }

    @Override
    public String getEquipment() {
        return "Hall";
    }
}
