package com.plurarsight;
import java.util.Scanner;

public class SandwishShop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

//Prompting the user for sandwish size
        double regSandwishSize = 5.45;
        double largSandwishSize = 8.95;

        System.out.println("Please, enter sandwish size");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");

        int choice = scanner.nextInt();

        double price = 0;

        if (choice == 1) {
            price = regSandwishSize;
        } else if (choice == 2) {
            price = largSandwishSize;
        } else {
            System.out.println("Invalid choice.");
            return;
        }



        System.out.println("Please, enter your age");
        int userAge = scanner.nextInt();

        if (userAge <= 17) {
            price = price - (price * 0.10);
        }else if (userAge>=65){
            price = price - (price * 0.20);


        }

        System.out.println("Final price: $" + price);
        scanner.close();



    }
}















