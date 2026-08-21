package currencyConverter.util;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	public static double total(double dollar, double amount) {
		double max = dollar * amount; 
		return  max + max /100 * IOF; 
	}
	
}
