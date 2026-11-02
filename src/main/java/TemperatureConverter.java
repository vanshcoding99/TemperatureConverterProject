/**
 * Converts temperatures between Celsius, Fahrenheit and Kelvin.
 * Each method is independent and does not call any other method.
 */
public class TemperatureConverter {

    /**
     * Converts a temperature from Celsius to Fahrenheit.
     *
     * @param celsius temperature in degrees Celsius
     * @return the same temperature in degrees Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Converts a temperature from Fahrenheit to Celsius.
     *
     * @param fahrenheit temperature in degrees Fahrenheit
     * @return the same temperature in degrees Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
}
