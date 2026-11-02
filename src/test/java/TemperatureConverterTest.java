import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureConverterTest {

    /** Allowed difference when comparing double results. */
    private static final double DELTA = 0.0001;

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    @DisplayName("celsiusToFahrenheit: 0 °C converts to 32 °F")
    void celsiusToFahrenheit_freezingPoint_returns32() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), DELTA);
    }

    @Test
    @DisplayName("fahrenheitToCelsius: 212 °F converts to 100 °C")
    void fahrenheitToCelsius_boilingPoint_returns100() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), DELTA);
    }

    @Test
    void celsiusToKelvin_freezingPoint_returns273_15() {
        assertEquals(273.15, converter.celsiusToKelvin(0.0), DELTA);
    }
}
