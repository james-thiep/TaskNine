package rate;

import java.util.Map;

public interface ExchangeRateService {
    double getExchangeRate(String fromCurrency, String toCurrency);
}

