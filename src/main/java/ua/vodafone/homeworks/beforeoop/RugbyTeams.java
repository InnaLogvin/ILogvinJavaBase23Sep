package ua.vodafone.homeworks.beforeoop;

import java.util.concurrent.ThreadLocalRandom;

public class RugbyTeams {

    public static void main(String[] args) {
        int[] ageArrayFirstTeam = generateAge(25);
        int[] ageArraySecondTeam = generateAge(25);

        printAge(ageArrayFirstTeam, ageArraySecondTeam);
        float averageAgeFirst = calculateAverageAge(ageArrayFirstTeam);
        System.out.println("\nThe average age of the first team is: " + Math.round(averageAgeFirst));

        float averageAgeSecond = calculateAverageAge(ageArraySecondTeam);
        System.out.println("The average age of the second team is: " + Math.round(averageAgeSecond));

    }

    public static int[] generateAge(int length) {
        int[] ageArray = new int[length];

        for (int i = 0; i < ageArray.length; i++) {
            ageArray[i] = ThreadLocalRandom.current().nextInt(18, 41);
        }
        return ageArray;
    }

    public static void printAge(int[]... teamAges) {
        for (int i = 0; i < teamAges.length; i++) {
            System.out.println("\nTeam " + (i + 1) + " ages: ");
            for (int number : teamAges[i]) {
                System.out.print(number + " ");
            }
        }
    }

    public static float calculateAverageAge(int[] teamAges) {
        int totalAge = 0;
        for (int number : teamAges) {
            totalAge += number;

        }
        //System.out.println("\nThe total age is: " + totalAge);
        float teamAverage = (float) totalAge / teamAges.length;
        return teamAverage;

    }
}
