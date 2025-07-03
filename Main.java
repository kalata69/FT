import java.util.*;

public class Main {
    static class Person {
        String name;
        String email;
        int age;

        Person(String name, String email, int age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " - " + email + " - " + age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        while (true) {
            System.out.print("Enter name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter age: ");
            int age;
            try {
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Try again.");
                continue;
            }

            people.add(new Person(name, email, age));
        }

        // Sort people by age (ascending)
        people.sort(Comparator.comparingInt(p -> p.age));

        System.out.println("\nSorted by age:");
        for (Person p : people) {
            System.out.println(p);
        }

        scanner.close();
    }
}