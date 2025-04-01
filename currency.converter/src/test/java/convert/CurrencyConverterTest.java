package convert;

import convert.TestExchangeRateService;
import rate.ExchangeRateService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {
    @Test
    void testCurrencyConversionWithFixedRate() {

        ExchangeRateService testService = new TestExchangeRateService(0.85);

        // Create converter with test service
        CurrencyConverter converter = new CurrencyConverter(testService);

        // Test conversion
        double result = converter.convert(100, "USD", "EUR");

        // Verify
        assertEquals(85.0, result, 0.001);
    }

    @Test
    void testCurrencyConversionWithDifferentRate() {
        // Create test double with different rate
        ExchangeRateService testService = new TestExchangeRateService(1.25);

        CurrencyConverter converter = new CurrencyConverter(testService);
        double result = converter.convert(100, "EUR", "GBP");

        assertEquals(125.0, result, 0.001);
    }
}