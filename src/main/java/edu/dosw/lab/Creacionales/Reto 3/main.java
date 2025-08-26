import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> cart = new ArrayList<>();
        String option;
        System.out.println("¡Welcome to the vehicle kingdom!");
        do {
            System.out.println("Select the vehicle type:");
            System.out.println("1. Earth\n2. Aquatic\n3. Air");
            int type = sc.nextInt();
            System.out.println("Select the vehicle category:");
            System.out.println("1. Económic\n2. Luxury\n3. Used");
            int category = sc.nextInt();
            int model = 0;
            if (type == 1) {
                System.out.println("1. Car\n2. Bicycle\n3. Motocycle");
                model = sc.nextInt();
            } else if (type == 2) {
                System.out.println("1. Boat\n2. Sailboat\n3. Jet Ski");
                model = sc.nextInt();
            } else if (type == 3) {
                System.out.println("1. Plane\n2. Small Plane\n3. Helicopter");
                model = sc.nextInt();
            }
            Vehicle v = VehicleFactory.createVehicle(type, model);
            if (category == 1) v = new Economic(v);
            else if (category == 2) v = new Luxury(v);
            else if (category == 3) v = new Used(v);
            cart.add(v);
            System.out.println("Do you like add another vehicle? (yes/no): ");
            option = sc.next();
        } while(option.equalsIgnoreCase("yes"));
        System.out.println("\n--- SUMMARY OF YOUR PURCHASE ---");
        int i = 1;
        for (Vehicle v : cart) {
            System.out.println("Vehícle " + i++ + ":");
            System.out.println("Type: " + v.getName());
            System.out.println("Maximum Speed: " + v.getMaximumSpeed() + " km/h");
            System.out.println("Price: $" + v.getPrice());
            System.out.println("Equipment: " + v.getEquipment());
            System.out.println();
        }

        double subtotal = cart.stream().mapToDouble(Vehicle::getPrice).sum();
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Discount applied: $0");
        System.out.println("Total to pay: $" + subtotal);
        System.out.println("\n¡Thanks for you bought in the vehicle kingdom!");
    }
}