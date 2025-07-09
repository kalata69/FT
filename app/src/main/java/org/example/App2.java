package org.example;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal;

        while (true) {
            System.out.print("Enter an animal (or type 'done' to exit): ");
            animal = scanner.nextLine().toLowerCase();

            if (animal.equals("done")) {
                System.out.println("Goodbye!");
                break;
            }

            int legs;

            switch (animal) {
                case "dog":
                case "cat":
                case "lion":
                case "tiger":
                case "elephant":
                case "cow":
                case "horse":
                case "bear":
                case "deer":
                    legs = 4;
                    break;
                case "human":
                case "person":
                case "penguin":
                case "chicken":
                case "duck":
                case "ostrich":
                case "kangaroo":
                    legs = 2;
                    break;
                case "spider":
                case "tarantula":
                    legs = 8;
                    break;
                case "ant":
                case "bee":
                case "beetle":
                case "fly":
                case "grasshopper":
                    legs = 6;
                    break;
                case "snake":
                case "worm":
                case "fish":
                case "eel":
                    legs = 0;
                    break;
                default:
                    System.out.println("Animal not recognized.");
                    continue;
            }

            System.out.println("A " + animal + " has " + legs + " legs.");
        }

        scanner.close();
    }
}
