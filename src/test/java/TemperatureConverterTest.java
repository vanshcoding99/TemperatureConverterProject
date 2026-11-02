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
}
