package com.plurarsight;
import java.util.Scanner;

public class SandwishShop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

//Prompting the user for sandwish size
        double regSandwishSize = 5.45;
        double largSandwishSize = 8.95;

        System.out.println("Please, enter sandwish size");
        System.out.println("A - Regular ($5.45)");
        System.out.println("B - Large ($8.95)");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("A")) {
            System.out.println("You selected Regular sandwich. Price: $" + regSandwishSize);
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("You selected Large sandwich. Price: $" + largSandwishSize);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}










    




