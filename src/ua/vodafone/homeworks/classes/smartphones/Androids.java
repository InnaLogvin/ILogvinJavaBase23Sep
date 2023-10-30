package ua.vodafone.homeworks.classes.smartphones;

import ua.vodafone.homeworks.classes.smartphones.Smartphones;

public class Androids implements Smartphones, LinuxOS {
    private final String name;
    private final String model;

    public Androids(String name, String model) { //конструктор для создания тел
        this.name = name;
        this.model = model;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("\nCalling from " + name + " " + model + " to " + phoneNumber);
    }

    @Override
    public void sms(String phoneNumber) {
        System.out.println("Sending SMS from " + name + " " + model + " to " + phoneNumber);
    }

    @Override
    public void internet(String browser) {
        System.out.println("Looking for pretty dog's pics from " + name + " " + model + " with " + browser);
    }

    @Override
    public void checkOsVersion(int osVersion) {
        if (osVersion < 15) {
            System.out.println("\nOS " + osVersion + " needs being updated for " + name + " " + model);
        } else {
            System.out.println("\nOS " + osVersion + " is up to date for " + name + " " + model);
        }
    }


}
