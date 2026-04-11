package com.plurarsight;
import java.util.Scanner;


public class SandwishShop {
    public static void main(String args[]) {
        //This scanner allows the user to input a value
        Scanner scanner = new Scanner(System.in);

    //Declaring variables for user input
        double regSandwishSize = 5.45;
        double largSandwishSize = 8.95;

        //Prompting the user to input the sandwich size, if the user chooses 1, that will be a regular size sandwish, else if the user choose 2, then that will be a large size sandwish
        System.out.println("Please, enter sandwish size");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");

        int choice = scanner.nextInt();
        scanner.nextLine();


        double price = 0;
    //Using if statments to determine the choice of sndwish that the user prefers
        if (choice == 1) {
            price = regSandwishSize;
        } else if (choice == 2) {
            price = largSandwishSize;
        } else {
            System.out.println("Invalid choice.");
            return; //Stopping the programming from moving forward until the next prompt
        }

        //Prompting the user to determine if they would be interested in a load
        System.out.println("Are you interested in a sandwish load? (Yes/NO):");
        String load = scanner.nextLine();

        //If the user agrees to take a loan, we will add $1 on the regular price, else we will add $1.75 on the large price.
        if (load.equalsIgnoreCase("yes")){
            if (choice == 1){
                price = price + 1.00;

            } else if (choice == 2) {
                price = price + 1.75;

            }

        }

    //Prompting the user for their age
        System.out.println("Please, enter your age");
        int userAge = scanner.nextInt();

        // USing if statements to determine the user's subtotal
        if (userAge <= 17) {
            price = price - (price * 0.10);
        }else if (userAge>=65){
            price = price - (price * 0.20);


        }

        System.out.println("Final price: $" + price);
        scanner.close();



    }
}















