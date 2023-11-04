package ua.vodafone.homeworks.classes.converter;

public class CelsiusFahrenheitConverter extends Converter {
    private static final double FAHRENHEIT_COEFFICIENT = 1.8;
    private static final double FAHRENHEIT_CONST = 32;

    @Override
    public double convertFromCelsius(double celsius) {
        return celsius * FAHRENHEIT_COEFFICIENT + FAHRENHEIT_CONST;
    }

    @Override
    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_CONST) / FAHRENHEIT_COEFFICIENT;
    }


}
