package com.plurarsight;
import java.util.Scanner;
public class coffeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //I created this exercie via openAi (ChaGpt) to exercie myself again to ensure I properly understand the sandwish statement
        // I prompted AI to make it more challenging than the previous one (sandwish.shop and pizz.shop).

        
        double smallDrink = 3.00;
        double mediumDrink = 4.50;
        double largeDrink = 6.00;

        System.out.println("Choose a drink size");
        System.out.println("1 - Small drink");
        System.out.println("2 - Medium drink");
        System.out.println("3 - large drink");

        int drinkChoice = scanner.nextInt();

        double price = 0;

        if (drinkChoice == 1){
            price = smallDrink;

        } else if (drinkChoice == 2) {
            price = mediumDrink;


        } else if (drinkChoice == 3) {
            price = largeDrink;

        }else {
            System.out.println("Invalid size choice.");

            scanner.close();
            return;
        }


        System.out.println("Choose drink type");
        System.out.println("1- Coffe");
        System.out.println("2- Latte (+ $1.50)");
        System.out.println("3- Cappucino (+$2.00)");

        int drinkType = scanner.nextInt();

        if (drinkType == 1){

        } else if (drinkType == 2) {
            price = price + 1.50;
        } else if (drinkType == 3) {
            price = price + 2.00;
        } else {
            System.out.println("Invalid drink type.");
            scanner.close();
            return;
        }

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age < 18){
            price = price - (price * 0.05);
        } else if (age >=65) {
             price = price - (price * 0.10);


        }
        scanner.nextLine();

        System.out.println("Would you like whipped cream? (yes/no)");
        String Cream = scanner.nextLine();

        if (Cream.equalsIgnoreCase("yes")){
            price = price + 0.50;

        }

        System.out.println("Would you like caramel drizzle? (yes/no)");
        String caramelDrizzle = scanner.nextLine();

        if (caramelDrizzle.equalsIgnoreCase("yes")){
            price = price + 0.75;


        }

        System.out.println("Are you a member? (yes/no)");
        String member = scanner.nextLine();

        if(member.equalsIgnoreCase("yes")){
            price = price - (price * 0.05);
        }

        System.out.println("Final price: $" + price);
        scanner.close();



    }

}
