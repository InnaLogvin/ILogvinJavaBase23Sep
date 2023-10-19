package ua.vodafone.homeworks.classes;

public class FitnessTrackerUser {
    private String name; //неизменные
    private int dayOfBirth; //неизменные
    private int monthOfBirth; //неизменные
    private int yearOfBirth; //неизменные
    private String mail; //неизменные
    private String phoneNumber; //неизменные
    private String surname;
    private String weight;
    private String bloodPressure;
    private int stepsNumber;
    private int age;
    private static final int YEAR = 2023;

    public FitnessTrackerUser(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                              String mail, String phoneNumber, String surname, String weight,
                              String bloodPressure, int stepsNumber) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsNumber = stepsNumber;
        this.age = calculateAge(yearOfBirth); //вызываем метод для рассчета возраста
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsNumber(int stepsNumber) {
        this.stepsNumber = stepsNumber;
    }

    public int getAge() {
        return age;
    }

    public static int calculateAge(int yearOfBirth) {
        int age;
        age = YEAR - yearOfBirth;
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Here is your user: " + name + " " + surname);
        System.out.println("The date of birth is: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);
        System.out.println("The age is: " + age);
        System.out.println("Contact: " + phoneNumber + ", " + mail);
        System.out.println("Weight: " + weight);
        System.out.println("Blood pressure: " + bloodPressure);
        System.out.println("Number of steps: " + stepsNumber);
        System.out.println("____________________________");
    }


}
