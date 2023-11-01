package ua.vodafone.homeworks.beforeoop;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        int number = ThreadLocalRandom.current().nextInt(11);
        //System.out.println(number);
        System.out.println("Guess the number, you have 3 attempts! Enter your value from 0 to 10: ");
        for (int i = 1; i <= attempts; i++) {

            int userNumberValue = scanner.nextInt();
            if (userNumberValue == number) {
                System.out.println("You are lucky!");
                break;
            } else if (i < attempts) {
                System.out.println("...not at all! Please, try again!");
            } else {
                System.out.println("Don't give up! Let's pay and play!");
            }
        }

    }
}
