package ua.vodafone.homeworks.classes;

public class CelsiusKelvinConverter extends Converter {

    @Override
    public double ConverterToCelsius(double kelvin) {
        System.out.println("Your temperature converted from Kelvin to Celsius: ");
        return (kelvin - Converter.KELVIN_CONST);
    }

    @Override
    public double ConverterToAnother(double celsius) {
        System.out.println("Your Kelvin temperature: ");
        return celsius + KELVIN_CONST;
    }


}