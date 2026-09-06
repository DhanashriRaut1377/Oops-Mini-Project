package com.touristconverter.converter;

import com.touristconverter.utility.CurrencyUtility;

public class CurrencyConverter {

    CurrencyUtility utility = new CurrencyUtility();

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {

        double rate = utility.getExchangeRate(fromCurrency, toCurrency);

        if (rate == -1) {
            return -1;
        }

        return amount * rate;
    }
}