package investment.util;

public class InvestmentCalculator {
	public static final double ANNUAL_RATE = 10.5;

	public static double totalRate(double year) {
		return year * ANNUAL_RATE;
	}

	public static double total(double investment, double year) {
		return investment + (investment / 100.0 * totalRate(year));
				
		}
	
	
}
