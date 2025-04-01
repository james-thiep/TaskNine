package convert;

import rate.ExchangeRateService;

public class CurrencyConverter {
    private final ExchangeRateService rateService;

    public CurrencyConverter(ExchangeRateService rateService) {
        this.rateService = rateService;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double rate = rateService.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}