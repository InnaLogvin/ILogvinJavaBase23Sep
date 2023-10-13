package ua.vodafone.homeworks;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int[] companyNumbers = generateNumbers(7);
        int[] customerNumbers = generateNumbers(7);

        System.out.println("Original numbers: ");
        printNumbers(companyNumbers);
        printNumbers(customerNumbers);

        bubbleSort(companyNumbers);
        bubbleSort(customerNumbers);

        System.out.println("Sorted numbers: ");
        printNumbers(companyNumbers);
        printNumbers(customerNumbers);

        int arrayMatch = match(companyNumbers, customerNumbers);
        System.out.println("Number of matches: " + arrayMatch);

    }

    public static int[] generateNumbers(int length) {
        int[] ageArray = new int[length];

        for (int i = 0; i < ageArray.length; i++) {
            ageArray[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return ageArray;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    public static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }

    public static void printNumbers(int[] array) {
        for (int number : array) {
            System.out.print(number);
        }
        System.out.println();
    }

    public static int match(int[] arrayCompany, int[] arrayCustomer) {
        int count = 0;
        for (int i = 0; i < arrayCompany.length; i++) {
            if (arrayCompany[i] == arrayCustomer[i]) {
                count++;
            }
        }
        return count;
    }
}
