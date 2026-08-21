package currencyConverter.application;

import java.util.Locale;
import java.util.Scanner;

import currencyConverter.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ? ");
		double dollar = sc.nextDouble(); 
		System.out.println("How many dollars will be bought ? ");
		double amount = sc.nextDouble(); 
		
		double total = CurrencyConverter.total(dollar,amount); 
		
		System.out.printf("Amount to be paid in reais = %.2f%n", total);
	
		sc.close();
	}

}
