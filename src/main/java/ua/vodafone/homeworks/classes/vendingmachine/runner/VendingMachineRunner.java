package ua.vodafone.homeworks.classes.vendingmachine.runner;

import ua.vodafone.homeworks.classes.vendingmachine.VendingMachine;


public class VendingMachineRunner {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.printOption();
        vendingMachine.executeOrder();

    }

}
