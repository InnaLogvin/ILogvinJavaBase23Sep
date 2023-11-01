package ua.vodafone.homeworks.classes.converter;

public class CelsiusKelvinConverter extends Converter {
    private static final double KELVIN_CONST = 273.15;

    @Override
    public double convertToCelsius(double kelvin) {
        return (kelvin - KELVIN_CONST);
    }

    @Override
    public double convertFromCelsius(double celsius) {
        return celsius + KELVIN_CONST;
    }


}