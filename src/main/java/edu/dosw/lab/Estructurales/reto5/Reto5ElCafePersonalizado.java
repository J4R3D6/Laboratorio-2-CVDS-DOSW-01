package edu.dosw.lab.Estructurales.reto5;

import java.util.*;

public class Reto5ElCafePersonalizado {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        List<Coffee> coffees = new ArrayList<>();
        System.out.print("Number of coffees to customize: ");
        int numCoffees = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, String> toppingsMenu = new HashMap<>();
        toppingsMenu.put(1, "Milk");
        toppingsMenu.put(2, "Caramel");
        toppingsMenu.put(3, "Chocolate");
        toppingsMenu.put(4, "Whipped Cream");
        toppingsMenu.put(5, "Custom Topping");
        for (int i = 1; i <= numCoffees; i++) {
            System.out.println("\n--- Coffee " + i + " ---");
            System.out.println("Available toppings:");
            toppingsMenu.forEach((k, v) -> System.out.println(k + ". " + v));
            System.out.print("Select toppings (comma separated numbers): ");
            String[] selected = scanner.nextLine().split(",");
            Coffee coffee = new BaseCoffee();
            for (String s : selected) {
                int option = Integer.parseInt(s.trim());
                switch (option) {
                    case 1 -> coffee = new Milk(coffee);
                    case 2 -> coffee = new Caramel(coffee);
                    case 3 -> coffee = new Chocolate(coffee);
                    case 4 -> coffee = new WhippedCream(coffee);
                    case 5 -> {
                        System.out.print("Enter name of the new topping: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter price of the topping: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        coffee = new CustomTopping(coffee, name, price);
                    }
                    default -> System.out.println("Invalid topping option.");
                }
            }
            coffees.add(coffee);
        }
        System.out.println("\n--- CUSTOMIZED COFFEE SUMMARY ---");
        int idx = 1;
        for (Coffee c : coffees) {
            System.out.println("Coffee " + idx++ + ":");
            System.out.println("Ingredients: " + c.getDescription());
            System.out.println("Total price: $" + c.getCost());
            System.out.println();
        }
        double total = coffees.stream().mapToDouble(Coffee::getCost).sum();
        System.out.println("Total to pay for all coffees: $" + total);
        System.out.println("Enjoy your coffee!");
    }
}
