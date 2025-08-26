public class JetSki implements Vehicle{
    @Override
    public String getName() {
        return "Jet Ski";
    }

    @Override
    public double getPrice() {
        return 120000;
    }

    @Override
    public double getMaximumSpeed() {
        return 170;
    }

    @Override
    public String getEquipment() {
        return "Nitro";
    }
}
