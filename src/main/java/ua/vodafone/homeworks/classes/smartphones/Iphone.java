package ua.vodafone.homeworks.classes.smartphones;

public class Iphone implements Smartphones, IOs {
    private final String model;

    public Iphone(String model) {

        this.model = model;

    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("\nCalling from iPhone " + model + " to " + phoneNumber);
    }

    @Override
    public void sms(String phoneNumber, String text) {
        System.out.println("Sending SMS '" + text + "' from iPhone " + model + " to " + phoneNumber);
    }

    @Override
    public void internet(String browser) {
        System.out.println("Looking for pretty cat's pics from iPhone " + model + " with " + browser);
    }

    @Override
    public void checkOsVersion(int osVersion) {
        if (osVersion < 10) {
            System.out.println("\niOS " + osVersion + " needs being updated for iPhone " + model);
        } else {
            System.out.println("\niOS " + osVersion + " is up to date for iPhone " + model);
        }
    }


}
