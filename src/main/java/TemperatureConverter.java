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
}
