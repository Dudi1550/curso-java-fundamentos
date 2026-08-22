package ethanol.util;

public class EthanolCalculator {
	public static final double ETHANOL_RATIO = 0.70;
	
	public static void isEthanolBetter(double ethanolPrice , double gasolinePrice) {
		if (ethanolPrice / gasolinePrice <= ETHANOL_RATIO) 	{
			System.out.println("Yes");
		}
		else { 
			 System.out.println("No ");
			
		}
	}
	
	public static double tripCost(double distance, double kmPerLiter, double fuelPrice) {
		return  (distance / kmPerLiter) * fuelPrice; 
	}
}
