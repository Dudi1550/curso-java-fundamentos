package investment.application;

import java.util.Locale;
import java.util.Scanner;

import investment.util.InvestmentCalculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("Enter initial investment: ");
		double investment = sc.nextDouble(); 
		System.out.println("Enter period in years ");
		double years = sc.nextDouble(); 
		
		double total = InvestmentCalculator.total(investment, years);
		
		System.out.printf("Total return value = R$ %.2f%n ",  total);
		
		sc.close();
	}

}
