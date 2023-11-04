package ua.vodafone.homeworks.classes.converter.packformain;

import ua.vodafone.homeworks.classes.converter.CelsiusKelvinConverter;
import ua.vodafone.homeworks.classes.converter.CelsiusFahrenheitConverter;

public class ConverterRunner {
    public static void main(String[] args) {
        double celsius = 10;
        CelsiusKelvinConverter toKelvin = new CelsiusKelvinConverter();
        System.out.println(celsius + " °C degrees converted to Kelvin: " +
                toKelvin.convertFromCelsius(celsius) + " K");

        CelsiusFahrenheitConverter toFahrenheit = new CelsiusFahrenheitConverter();
        System.out.println(celsius + " °C degrees converted to Fahrenheit: " +
                toFahrenheit.convertFromCelsius(celsius) + " °F");

        double kelvin = toKelvin.convertFromCelsius(celsius);
        CelsiusKelvinConverter kelvinToCelsius = new CelsiusKelvinConverter();
        System.out.println(kelvin + " K degrees converted back to Celsius: " +
                kelvinToCelsius.convertToCelsius(kelvin) + " °C");

        double fahrenheit = toFahrenheit.convertFromCelsius(celsius);
        CelsiusFahrenheitConverter fahrenheitToCelsius = new CelsiusFahrenheitConverter();
        System.out.println(fahrenheit + " °F degrees converted back to Celsius: " +
                fahrenheitToCelsius.convertToCelsius(fahrenheit) + " °C");
    }


}
