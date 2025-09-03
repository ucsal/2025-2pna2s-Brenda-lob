package br.com.mariojp.solid.srp;

public class TaxCalculator {
	public double calculateTax(double subtotal) {
		String taxRateProperty = System.getProperty("tax.rate");
		double taxRate = taxRateProperty != null ? Double.parseDouble(taxRateProperty) : 0.10;
		return subtotal * taxRate;
	}
}