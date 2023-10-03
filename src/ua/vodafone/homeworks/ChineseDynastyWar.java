package ua.vodafone.homeworks;

public class ChineseDynastyWar {
    private static final int LI_ARMY_SIZE = 860;
    private static final int LI_WARRIOR = 13;
    private static final int LI_ARCHER = 24;
    private static final int LI_CAVALRY = 46;

    private static final int MIN_WARRIOR = 9;
    private static final int MIN_ARCHER = 35;
    private static final int MIN_CAVALRY = 12;
    private static final int MIN_ARMY_SIZE = (int) (LI_ARMY_SIZE * 1.5);

    public static void main(String[] args) {
        System.out.println("Dynasty Li attack level is: " + calculateAttackLevel(LI_WARRIOR, LI_ARCHER, LI_CAVALRY, LI_ARMY_SIZE));
        System.out.println("Dynasty Min attack level is: " + calculateAttackLevel(MIN_WARRIOR, MIN_ARCHER, MIN_CAVALRY, MIN_ARMY_SIZE));
    }

    public static int calculateAttackLevel(int warrior, int archer, int cavalry, int armySize) {
        return armySize * (warrior + archer + cavalry);

    }
}
