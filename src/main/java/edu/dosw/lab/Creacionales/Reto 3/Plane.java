public class Plane implements Vehicle{
    @Override
    public String getName() {
        return "Plane";
    }

    @Override
    public double getPrice() {
        return 500000;
    }

    @Override
    public double getMaximumSpeed() {
        return 300;
    }

    @Override
    public String getEquipment() {
        return "Class";
    }
}
