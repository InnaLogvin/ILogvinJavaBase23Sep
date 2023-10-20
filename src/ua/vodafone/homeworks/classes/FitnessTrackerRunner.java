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
        for (int i = 0; i < user.length; i++) {
            user[i].printAccountInfo();
        }

        user[2].setSurname("Serhienko");
        user[2].setWeight("90");

        user[3].setStepsNumber(25000);
        user[3].setBloodPressure("165/115");

        System.out.println("\nCheck updated users:\n");
        System.out.println(user[2].getName() + " " + user[2].getSurname() + ", " + user[2].getDayOfBirth() + "." +
                user[2].getMonthOfBirth() + "." + user[2].getYearOfBirth() + ", " + user[2].getMail() + ", " +
                user[2].getPhoneNumber() + ", " + user[2].getWeight() + ", " + user[2].getBloodPressure() + ", " + user[2].getStepsNumber());
        System.out.println(user[3].getName() + " " + user[3].getSurname() + ", " + user[3].getDayOfBirth() + "." +
                user[3].getMonthOfBirth() + "." + user[3].getYearOfBirth() + ", " + user[3].getMail() + ", " +
                user[3].getPhoneNumber() + ", " + user[3].getWeight() + ", " + user[3].getBloodPressure() + ", " + user[3].getStepsNumber());


    }
}


