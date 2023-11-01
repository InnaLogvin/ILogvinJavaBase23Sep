package ua.vodafone.homeworks.beforeoop;

import java.util.Scanner;

public class CounterStrikeCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first team name: ");
        String firstTeamName = scanner.nextLine();


        System.out.println("Enter each player's frags for team " + firstTeamName + " :");
        int player1First = scanner.nextInt();
        int player2First = scanner.nextInt();
        int player3First = scanner.nextInt();
        int player4First = scanner.nextInt();
        int player5First = scanner.nextInt();


        System.out.print("Enter the second team name: ");
        scanner.nextLine();
        String secondTeamName = scanner.nextLine();
        System.out.println("Enter each player's frags for team " + secondTeamName + " :");
        int player1Second = scanner.nextInt();
        int player2Second = scanner.nextInt();
        int player3Second = scanner.nextInt();
        int player4Second = scanner.nextInt();
        int player5Second = scanner.nextInt();

        double firstTeamAverage = (player1First + player2First + player3First + player4First + player5First) / 5.0;
        double secondTeamAverage = (player1Second + player2Second + player3Second + player4Second + player5Second) / 5.0;

        String result;
        double eps = 0.01;
        if ((firstTeamAverage + eps) > secondTeamAverage) {
            result = "The winner is " + firstTeamName + " with an average of " + firstTeamAverage + " frags a game.";
        } else if ((secondTeamAverage + eps) > firstTeamAverage) {
            result = "The winner is " + secondTeamName + " with an average of " + secondTeamAverage + " frags a game.";
        } else {
            result = "it's a tie!";
        }

        System.out.println(result);

        //scanner.close();
    }
}

