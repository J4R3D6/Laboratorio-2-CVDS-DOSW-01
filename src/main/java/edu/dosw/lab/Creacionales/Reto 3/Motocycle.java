public class Motocycle implements Vehicle{
    @Override
    public String getName() {
        return "Motocycle";
    }

    @Override
    public double getPrice() {
        return 20000;
    }

    @Override
    public double getMaximumSpeed() {
        return 120;
    }

    @Override
    public String getEquipment() {
        return "Bluetooth connection";
    }
}
