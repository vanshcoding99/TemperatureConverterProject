# Temperature Converter (COMP 3520 Assignment 3)

A small Java temperature converter built with Test-Driven Development
(Red, Green, Refactor) using JUnit 5, Maven and Git.

| Method | Formula |
|---|---|
| `celsiusToFahrenheit(double celsius)` | F = (C × 9.0 / 5.0) + 32 |
| `fahrenheitToCelsius(double fahrenheit)` | C = (F − 32) × 5.0 / 9.0 |
| `celsiusToKelvin(double celsius)` | K = C + 273.15 |

## Run the tests

- IntelliJ IDEA: open `TemperatureConverterTest` and click the green run button.
- Maven: `mvn test`

Every push to `main` also runs the tests on GitHub Actions (see the **Actions** tab).
Each commit in the history is one step of the Red, Green, Refactor cycle.
