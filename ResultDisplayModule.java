package com.touristconverter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ResultDisplayModule {
    
    // Labels to display results
    private JLabel resultLabel;
    private JLabel rateLabel;
    private JLabel currencyNameLabel;
    
    // Constructor
    public ResultDisplayModule(JLabel resultLabel, JLabel rateLabel, JLabel currencyNameLabel) {
        this.resultLabel = resultLabel;
        this.rateLabel = rateLabel;
        this.currencyNameLabel = currencyNameLabel;
    }
    
    // Display converted amount
    public void displayResult(double convertedAmount, String targetCurrency) {
        resultLabel.setText(String.format("%.2f %s", convertedAmount, targetCurrency));
    }
    
    // Display exchange rate
    public void displayRate(double rate, String fromCurrency, String toCurrency) {
        rateLabel.setText(String.format("1 %s = %.4f %s", fromCurrency, rate, toCurrency));
    }
    
    // Display currency names
    public void displayCurrencyNames(String fromName, String toName) {
        currencyNameLabel.setText(String.format("%s to %s", fromName, toName));
    }
    
    // Show warning if needed
    public void showWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
    }
    
    // Clear all displays
    public void clearDisplay() {
        resultLabel.setText("");
        rateLabel.setText("");
        currencyNameLabel.setText("");
    }
}