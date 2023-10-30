package ua.vodafone.homeworks.classes.smartphones;

public class SmartphoneRunner {

    public static void main(String[] args) {
        String phoneNumber = "0504682101";
        String browserIPhone = "Safari";
        String browserAndroid = "Chrome";
        int osVersion = 11;

        Smartphones[] phones = {
                new Androids("Samsung", "S23"),
                new Androids("Xiaomi", "Note 12"),
                new Androids("Xiaomi", "Redmi A2"),
                new iPhones("13 mini"),
                new iPhones("14 Pro"),
                new iPhones("15 Plus")
        };
        for (Smartphones phone : phones) {
            phone.call(phoneNumber);
            phone.sms(phoneNumber);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            phones[i].internet(browserAndroid);
        }
        System.out.println();
        for (int i = 3; i < 6; i++) {
            phones[i].internet(browserIPhone);
        }

        ((iPhones) phones[3]).checkOsVersion(osVersion);
        ((Androids) phones[0]).checkOsVersion(osVersion);
    }
}
