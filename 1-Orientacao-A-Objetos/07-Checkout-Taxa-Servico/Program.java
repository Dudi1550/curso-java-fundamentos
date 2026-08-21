package checkout.application;

import java.util.Locale;
import java.util.Scanner;

import checkout.util.Checkout;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the unit price: ");
		double pay = sc.nextDouble(); 
		System.out.println("Enter quantity");
		double quantity = sc.nextDouble(); 
		
		double total = Checkout.addTax(pay, quantity); 
		
		System.out.printf("Total amount to be paid = %.2f%n ", total);
		
		sc.close();
	}

}
