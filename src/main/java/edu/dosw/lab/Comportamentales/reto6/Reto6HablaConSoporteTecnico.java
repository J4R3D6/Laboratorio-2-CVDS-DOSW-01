package edu.dosw.lab.Comportamentales.reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Reto6HablaConSoporteTecnico {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        List<Ticket> tickets = new ArrayList<>();
        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nTicket " + (i+1) + ":");
            System.out.print("Enter description: ");
            String desc = sc.nextLine();
            System.out.print("Enter level (1.Basic 2.Intermediate 3.Advanced): ");
            int levelOption = sc.nextInt();
            Level level = (levelOption == 1) ? Level.BASIC :
                    (levelOption == 2) ? Level.INTERMEDIATE : Level.ADVANCED;
            System.out.print("Enter priority (1.Low 2.Medium 3.High): ");
            int prioOption = sc.nextInt();
            Priority priority = (prioOption == 1) ? Priority.LOW :
                    (prioOption == 2) ? Priority.MEDIUM : Priority.HIGH;
            sc.nextLine();
            tickets.add(new Ticket(desc, level, priority));
        }
        Technician basic = new BasicTechnician();
        Technician intermediate = new IntermediateTechnician();
        Technician advanced = new AdvancedTechnician();
        basic.setNext(intermediate);
        intermediate.setNext(advanced);
        tickets.forEach(basic::handleTicket);
        System.out.println("\n--- RESULTS ---");
        tickets.forEach(System.out::println);
        long pending = tickets.stream().filter(t -> !t.isResolved()).count();
        Map<String, Long> resolvedCount = tickets.stream()
                .filter(Ticket::isResolved)
                .collect(Collectors.groupingBy(Ticket::getResolvedBy, Collectors.counting()));
        double avgPriority = tickets.stream()
                .filter(Ticket::isResolved)
                .mapToInt(t -> t.getPriority().getValue())
                .average().orElse(0);
        System.out.println("--- STATISTICS ---");
        System.out.println("Resolved by technician: " + resolvedCount);
        System.out.println("Pending tickets: " + pending);
        System.out.println("Average priority of resolved tickets: " + avgPriority);
    }
}
