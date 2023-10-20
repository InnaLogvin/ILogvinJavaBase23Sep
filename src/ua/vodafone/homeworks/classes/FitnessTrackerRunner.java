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

        System.out.println("\nCheck all users after updating:\n");
        for (int i = 0; i < user.length; i++) {
            user[i].printAccountInfo();

            String name = user[0].getName();
            int dayOfBirth = user[0].getDayOfBirth();
            int monthOfBirth = user[0].getMonthOfBirth();
            int yearOfBirth = user[0].getYearOfBirth();
            String mail = user[0].getMail();
            String phoneNumber = user[0].getPhoneNumber();

            System.out.println("\nThis information we get with get: " + name + ", " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth + ", " + mail + ", " + phoneNumber);

        }
    }

}
