package ua.vodafone.homeworks.classes;

public class CelsiusFahrenheitConverter extends Converter {
    @Override
    public double ConverterToAnother(double celsius) {
        System.out.println("Your Fahrenheit temperature: ");
        return celsius * FAHRENHEIT_COEFFICIENT + FAHRENHEIT_CONST;
    }

    @Override
    public double ConverterToCelsius(double fahrenheit) {
        System.out.println("Your temperature converted from Fahrenheit to Celsius: ");
        return (fahrenheit - Converter.FAHRENHEIT_CONST) / Converter.FAHRENHEIT_COEFFICIENT;
    }


}
