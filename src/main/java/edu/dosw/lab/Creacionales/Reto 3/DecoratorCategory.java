abstract class DecoratorCategory implements Vehicle {
    protected Vehicle vehicle;
    public DecoratorCategory(Vehicle v) { this.vehicle = v; }

    public String getName() { return vehicle.getName(); }
    public double getPrice() { return vehicle.getPrice(); }
    public double getMaximumSpeed() { return vehicle.getMaximumSpeed(); }
    public String getEquipment() { return vehicle.getEquipment(); }
}