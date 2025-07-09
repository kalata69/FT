package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String[]> people = new ArrayList<>();

        while (true) {
            System.out.print("Name (or 'done'): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Age: ");
            int age;
            try {
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.\n");
                continue;
            }

            people.add(new String[] {name, email, String.valueOf(age)});
            System.out.println("Person added!\n");
        }

        // Sort by age (convert age string to int)
        people.sort(Comparator.comparingInt(p -> Integer.parseInt(p[2])));

        System.out.println("\n--- People Sorted by Age ---");
        for (String[] p : people) {
            System.out.println(p[0] + " | " + p[1] + " | Age: " + p[2]);
        }

        scanner.close();
    }
}