package ua.vodafone.homeworks.classes;

public class FitnessTrackerRunner {
    public static void main(String[] args) {
        FitnessTrackerUser[] user = {
                new FitnessTrackerUser("Inna", 25, 3, 1991, "inna@gmail.com",
                        "0504682101", "Logvin", "58", "180/120", 10000),
                new FitnessTrackerUser("Anna", 10, 10, 1995, "anna@gmail.com",
                        "0674682101", "Shevchenko", "55", "170/110", 15000),
                new FitnessTrackerUser("Bohdan", 13, 11, 1999, "bohdan@gmail.com",
                        "0994682101", "Ivanov", "70", "160/100", 18000),
                new FitnessTrackerUser("Roman", 18, 12, 1997, "roman@gmail.com",
                        "0664682101", "Andreev", "80", "180/120", 20000)

        };
        user[0].printAccountInfo();
        user[1].printAccountInfo();
        user[2].printAccountInfo();
        user[3].printAccountInfo();

        user[2].setSurname("Serhienko");
        user[2].setWeight("90");

        user[3].setStepsNumber(25000);
        user[3].setBloodPressure("165/115");

        System.out.println("\nCheck your updated users:\n");
        user[0].printAccountInfo();
        user[1].printAccountInfo();
        user[2].printAccountInfo();
        user[3].printAccountInfo();
    }

}
