package ua.vodafone.homeworks;

import java.util.concurrent.ThreadLocalRandom;

public class RugbyTeams {

    public static void main(String[] args) {
        int[] ageArrayFirstTeam = GenerateAge(25);
        int[] ageArraySecondTeam = GenerateAge(25);

        PrintAge(ageArrayFirstTeam, ageArraySecondTeam);
        float averageAgeFirst = CalculateAverageAge(ageArrayFirstTeam);
        System.out.println("\nThe average age of the first team is: " + Math.round(averageAgeFirst));
        float averageAgeSecond = CalculateAverageAge(ageArraySecondTeam);
        System.out.println("The average age of the first team is: " + Math.round(averageAgeSecond));

    }

    public static int[] GenerateAge(int length) {
        int[] ageArray = new int[length];

        for (int i = 0; i < length; i++) {
            ageArray[i] = ThreadLocalRandom.current().nextInt(18, 41);
        }
        return ageArray;

    }

    public static void PrintAge(int[] firstTeamAges, int[] secondTeamAges) {
        System.out.println("First team ages: ");
        for (int number : firstTeamAges) {
            System.out.print(number + " ");

        }
        System.out.println("\nSecond team ages: ");
        for (int number : secondTeamAges) {
            System.out.print(number + " ");
        }
    }

    public static float CalculateAverageAge(int[] teamAges) {
        int totalAge = 0;
        for (int number : teamAges) {
            totalAge += number;

        }
        //System.out.println("\nThe total age is: " + totalAge);
        float teamAverage = (float) totalAge / teamAges.length;
        return teamAverage;

    }
}
