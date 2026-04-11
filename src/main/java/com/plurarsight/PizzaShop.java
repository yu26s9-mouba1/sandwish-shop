package com.plurarsight;
import java.util.Scanner;
public class PizzaShop {
    public static void main(String[] args){
        //Practicing to understand the previous exercice (sandwish-shop) to have better understanding and master if-else statments
        Scanner scanner = new Scanner(System.in);
        double smallPrice = 8.00;
        double  mediumPrice = 10.50;
        double largePizza = 13.00;

        System.out.println("Please choose your pizza size:");
        System.out.println("1 - Small pizza: " + smallPrice);
        System.out.println("2 - Medium pizza: " + mediumPrice);
        System.out.println("3 - Large pizza: " + largePizza);

        int choice = scanner.nextInt();

        double price = 0;

        if (choice == 1){
            price = smallPrice;

        } else if (choice == 2) {
            price = mediumPrice;

        } else if (choice == 3) {
            price = largePizza;
        }else {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }


        System.out.println("Please, enter your age:");
        int age = scanner.nextInt();

        if (age <= 12){
            price = price - (price * .15);
        } else if (age >= 60) {
            price = price - (price * .10);
        }
        scanner.nextLine();


        System.out.println("Would you like extra cheeze? (yes/no)");
        String ischeese = scanner.nextLine();

        if (ischeese.equalsIgnoreCase("yes")){
            if ( choice == 1){
                price = price + 1.00;
            } else if (choice == 2) {
                price =price + 1.50;
            } else if (choice == 3) {
                price = price + 2.00;

            }

        }



        System.out.println("Delivery or Pickup? D/P");
        String delivery = scanner.nextLine();

        if (delivery.equalsIgnoreCase("D")){
            price = price + 3.00;

        }

        System.out.println("Your subtotal is  $" + price);

        scanner.close();




    }
}
