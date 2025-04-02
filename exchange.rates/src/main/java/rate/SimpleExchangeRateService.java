package rate;

import java.util.Map;

public class SimpleExchangeRateService implements ExchangeRateService {
    private final Map<String, Double> rates = Map.of(
            "USD-UGX", 0.85,
            "EUR-USD", 1.18,
            "USD-GBP", 0.73,
            "GBP-USD", 1.38
    );

    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        return rates.getOrDefault(fromCurrency + "-" + toCurrency, 1.0);
    }
}
