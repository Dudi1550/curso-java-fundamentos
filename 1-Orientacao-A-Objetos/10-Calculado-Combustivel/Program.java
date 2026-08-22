package ethanol.application;

import java.util.Locale;
import java.util.Scanner;

import ethanol.util.EthanolCalculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter ethanol price: ");
		double ethanolPrice = sc.nextDouble(); 
		System.out.println("Enter gasoline price: ");
		double gasolinePrice = sc.nextDouble(); 
		
		System.out.println("Enter trip distance: ");
		double distance = sc.nextDouble();
		System.out.println("Enter the car fuel efficiency:  ");
		double kmPerLiter = sc.nextDouble(); 
		
		
		System.out.print("Is it worth filling up with ethanol? ");
		EthanolCalculator.isEthanolBetter(ethanolPrice, gasolinePrice);
		
		double cost = EthanolCalculator.tripCost(distance, kmPerLiter, ethanolPrice);
		System.out.printf("Estimated cost of the trip? %.2f%n ", cost);
		
		
		sc.close();
	}

}
