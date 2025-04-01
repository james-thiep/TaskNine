package convert;

import rate.ExchangeRateService;

public class TestExchangeRateService implements ExchangeRateService {
    private final double fixedRate;

    public TestExchangeRateService(double fixedRate) {
        this.fixedRate = fixedRate;
    }

    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        return fixedRate; // Always return the fixed rate for testing
    }
}