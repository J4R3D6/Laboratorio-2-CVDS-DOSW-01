public class Sailboat implements Vehicle{
    @Override
    public String getName() {
        return "Sailboat";
    }

    @Override
    public double getPrice() {
        return 150000;
    }

    @Override
    public double getMaximumSpeed() {
        return 120;
    }

    @Override
    public String getEquipment() {
        return "Jacuzzi";
    }
}
