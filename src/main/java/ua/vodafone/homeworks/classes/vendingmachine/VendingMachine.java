package ua.vodafone.homeworks.classes.vendingmachine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class VendingMachine {
    public enum Drinks {
        COFFEE("coffee", 40),
        TEA("tea", 30),
        LEMONADE("lemonade", 35),
        MOJITO("mojito", 50.5),
        CARBONATED_WATER("carbonated_water", 25),
        COCA_COLA("coca_cola", 38);
        private final String name;
        private final double price;

        Drinks(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " " + price;
        }
    }

    public void printOption() {
        System.out.println("Choose your drink: ");
        Drinks[] drinksOptions = Drinks.values();
        for (Drinks value : drinksOptions) {
            System.out.println(value.getName() + " " + value.getPrice() + " UAH");
        }
    }

    String preparingDrinks(Drinks drink) {
        switch (drink) {
            case COFFEE:
                return "Making " + drink.getName() + "...";
            case TEA:
                return "Making " + drink.getName() + "...";
            case LEMONADE:
                return drink.getName() + " dispensed...";
            case MOJITO:
                return "Making " + drink.getName() + "...";
            case CARBONATED_WATER:
                return drink.getName() + " dispensed...";
            case COCA_COLA:
                return drink.getName() + " dispensed...";
        }
        throw new IllegalArgumentException("Unexpected drink");
    }


    private String calculateTotal(List<Drinks> orderedDrinks) {
        double totalAmount = 0;
        int totalDrinks = orderedDrinks.size();

        for (Drinks drink : orderedDrinks) {
            totalAmount += drink.getPrice();
        }

        return "Total drinks ordered: " + totalDrinks + "\nTotal amount to pay: " + totalAmount + " UAH";
    }

    public void executeOrder() {
        Scanner scanner = new Scanner(System.in);
        List<Drinks> orderedDrinks = new ArrayList<>();

        while (true) {
            System.out.println("Enter drink's name or 'exit' to finish: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                Drinks selectedDrink = Drinks.valueOf(userChoice.toUpperCase());
                System.out.println(preparingDrinks(selectedDrink));
                orderedDrinks.add(selectedDrink);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        String total = calculateTotal(orderedDrinks);
        System.out.println(total);
    }

}
