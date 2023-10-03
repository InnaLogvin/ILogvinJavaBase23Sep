package ua.vodafone.homeworks;

public class ChineseDynastyLiMinWar {
    public static void main(String[] args) {
        int liArmySize = 860;
        int liWarrior = 13;
        int liArcher = 24;
        int liCavalry = 46;
        int minWarrior = 9;
        int minArcher = 35;
        int minCavalry = 12;
        int minArmySize = (int) (liArmySize * 1.5);
        System.out.println("Dynasty Li attack level is: " + calculateAttackLevel(liWarrior, liArcher, liCavalry, liArmySize));
        System.out.println("Dynasty Min attack level is: " + calculateAttackLevel(minWarrior, minArcher, minCavalry, minArmySize));
        System.out.println("test");
    }

    public static int calculateAttackLevel(int warrior, int archer, int cavalry, int armySize) {
        return armySize * (warrior + archer + cavalry);

    }

}


