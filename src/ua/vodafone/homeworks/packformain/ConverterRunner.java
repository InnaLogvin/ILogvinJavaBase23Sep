package ua.vodafone.homeworks.packformain;

import ua.vodafone.homeworks.classes.Converter;
import ua.vodafone.homeworks.classes.CelsiusToKelvin;
import ua.vodafone.homeworks.classes.CelsiusToFahrenheit;

public class ConverterRunner {
    public static void main(String[] args) {
        CelsiusToKelvin kelvinConverter = new CelsiusToKelvin();
        System.out.println(kelvinConverter.CelsiusToKelvin(10));
        ;

        CelsiusToFahrenheit fahrenheitConverter = new CelsiusToFahrenheit();
        System.out.println(fahrenheitConverter.CelsiusToFahrenheit(10));

        double fahrenheitToCelsius = FahrenheitToCelsius(50);
        System.out.println(fahrenheitToCelsius);

        double kelvinToCelsius = KelvinToCelsius(283.15);
        System.out.println(kelvinToCelsius);
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        System.out.println("Your temperature converted from Fahrenheit to Celsius: ");
        return (fahrenheit - Converter.FAHRENHEIT_CONST) / Converter.FAHRENHEIT_COEFFICIENT;
    }

    public static double KelvinToCelsius(double kelvin) {
        System.out.println("Your temperature converted from Kelvin to Celsius: ");
        return (kelvin - Converter.KELVIN_CONST);
    }
}
