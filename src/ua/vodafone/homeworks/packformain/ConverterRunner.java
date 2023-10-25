package ua.vodafone.homeworks.packformain;

import ua.vodafone.homeworks.classes.CelsiusKelvinConverter;
import ua.vodafone.homeworks.classes.CelsiusFahrenheitConverter;

public class ConverterRunner {
    public static void main(String[] args) {
        CelsiusKelvinConverter toKelvin = new CelsiusKelvinConverter();
        System.out.println(toKelvin.ConverterToAnother(10));

        CelsiusFahrenheitConverter toFahrenheit = new CelsiusFahrenheitConverter();
        System.out.println(toFahrenheit.ConverterToAnother(10));

        CelsiusKelvinConverter kelvinToCelsius = new CelsiusKelvinConverter();
        System.out.println(kelvinToCelsius.ConverterToCelsius(283.15));

        CelsiusFahrenheitConverter fahrenheitToCelsius = new CelsiusFahrenheitConverter();
        System.out.println(fahrenheitToCelsius.ConverterToCelsius(50));
    }


}
