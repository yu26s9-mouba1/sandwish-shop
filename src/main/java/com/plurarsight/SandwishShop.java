package com.plurarsight;
import java.util.Scanner;

public class SandwishShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring Prices
        double regSandwichSize = 5.45;
        double largeSandwichSize = 8.95;

        // Prompting the user for sandwich size
        System.out.println("Please, enter sandwich size");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");

        int choice = scanner.nextInt();

        double price = 0;

        if (choice == 1) {
            price = regSandwichSize;
        } else if (choice == 2) {
            price = largeSandwichSize;
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        // Prompting the user for their age
        System.out.println("Please, enter your age");
        int userAge = scanner.nextInt();

        // Applying discount depending on user age
        if (userAge <= 17) {
            price = price - (price * 0.10);
        } else if (userAge >= 65) {
            price = price - (price * 0.20);
        }

        //clear the previous input befrore reading next
        scanner.nextLine();

        // Ask for loaded AFTER age
        System.out.println("Are you interested in a sandwich load? (Yes/No):");
        String load = scanner.nextLine();

        if (load.equalsIgnoreCase("yes")) {
            if (choice == 1) {
                price = price + 1.00;
            } else if (choice == 2) {
                price = price + 1.75;
            }
        }

        // Final output/price
        System.out.println("Final price: $" + price);

        scanner.close();
    }
}