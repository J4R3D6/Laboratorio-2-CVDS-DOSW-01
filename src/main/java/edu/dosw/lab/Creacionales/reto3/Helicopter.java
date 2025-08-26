package edu.dosw.lab.Creacionales.reto3;
public class Helicopter implements Vehicle{
    @Override
    public String getName() {
        return "Helicopter";
    }

    @Override
    public double getPrice() {
        return 200000;
    }

    @Override
    public double getMaximumSpeed() {
        return 220;
    }

    @Override
    public String getEquipment() {
        return "Communication equipment";
    }
}
