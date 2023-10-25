package ua.vodafone.homeworks.classes;

public abstract class Converter {
    public static final double KELVIN_CONST = 273.15;
    public static final double FAHRENHEIT_COEFFICIENT = 1.8;
    public static final double FAHRENHEIT_CONST = 32;

    public abstract double CelsiusToFahrenheit(double celsius);

    public abstract double CelsiusToKelvin(double celsius);
//    public abstract double FahrenheitToCelsius(double fahrenheit);
//    public abstract double KelvinToCelsius(double kelvin);
}
