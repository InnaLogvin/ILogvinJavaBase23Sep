package ua.vodafone.homeworks.classes.vendingmachine.runner;

import ua.vodafone.homeworks.classes.vendingmachine.VendingMachine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class VendingMachineRunner {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.printOption();

        Scanner scanner = new Scanner(System.in);
        List<VendingMachine.Drinks> orderedDrinks = new ArrayList<>();

        while (true) {
            System.out.println("Enter drink's name or 'exit' to finish: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                VendingMachine.Drinks selectedDrink = VendingMachine.Drinks.valueOf(userChoice.toUpperCase());
                System.out.println(VendingMachine.preparingDrinks(selectedDrink));
                orderedDrinks.add(selectedDrink);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        vendingMachine.printTotals(orderedDrinks);
    }

}
