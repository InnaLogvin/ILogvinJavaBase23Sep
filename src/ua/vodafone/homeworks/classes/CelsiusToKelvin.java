package ua.vodafone.homeworks.classes;

public class CelsiusToKelvin extends Converter {

    public double CelsiusToKelvin(double celsius) {
        System.out.println("Your Kelvin temperature: ");
        return celsius + KELVIN_CONST;
    }

    public double CelsiusToFahrenheit(double celsius) {
        System.out.println("Your Fahrenheit temperature: ");
        return celsius * FAHRENHEIT_COEFFICIENT + FAHRENHEIT_CONST;
    }

}