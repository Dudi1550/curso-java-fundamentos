package checkout.util;

public class Checkout {
	public static final double SERVICE_FEE = 5; 
	public static final double TAX = 8;
	
		
	
	public static double addTax(double pay, double quantity) {
		double total =  pay * quantity;
		double taxAmount = total / 100 * (SERVICE_FEE + TAX);
		return total + taxAmount;
	}
	
	
	

}
