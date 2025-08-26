public class Car implements Vehicle{

    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public double getPrice() {
        return 50000;
    }

    @Override
    public double getMaximumSpeed() {
        return 100;
    }

    @Override
    public String getEquipment() {
        return "air-conditioning";
    }
}
