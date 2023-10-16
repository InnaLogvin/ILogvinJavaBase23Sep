package ua.vodafone.homeworks.classes;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private String phoneNumber;

    //конструктор Person
    public Person(String name, String lastName, String city, String phoneNumber) {//цей конструктор ініціалізує поля класу параметрами
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    public String personInfo() {//метод для отримання заданної інфо в параметрах
        return "You can call citizen " + name + " " + lastName + " from " + city + " city by phone number " + phoneNumber + ".";
    }

    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(person1.personInfo());

        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(person2.personInfo());

        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(person3.personInfo());

    }
}

