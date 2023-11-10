package ua.vodafone.homeworks.classes;

import java.util.Scanner;

import ua.vodafone.homeworks.classes.VendingMachine.Drinks;

public class VendingMachineRunner {
    public static void main(String[] args) {
        VendingMachine drinks = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your drink: ");

        Drinks[] drinksOption = Drinks.values();
        for (Drinks value : drinksOption) {
            System.out.println(value.getOrder() + ". " + value.getName() + " " + value.getPrice() + " UAH");
        }
        double totalAmount = 0;
        int totalDrinks = 0;

        while (true) {
            System.out.println("Enter drink's number (0 to finish): ");
            int userChoice = scanner.nextInt();

            if (userChoice == 0) {
                System.out.println("Order is accepted!");
                break;
            }

            if (userChoice >= 1 && userChoice <= drinksOption.length) {
                Drinks selectedDrink = Drinks.values()[userChoice - 1];
                String message = drinks.chooseDrinks(selectedDrink);
                System.out.println(message);

                totalAmount += selectedDrink.getPrice();
                totalDrinks++;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        if (totalDrinks > 1) {
            System.out.println("You've ordered " + totalDrinks + " drinks.");
            System.out.println("Total amount to pay: " + totalAmount + " UAH.");
        } else if (totalDrinks == 1) {
            System.out.println("You've ordered 1 drink.");
            System.out.println("Total amount to pay: " + totalAmount + " UAH.");
        } else {
            System.out.println("You haven't order anything.");
        }

    }
}
