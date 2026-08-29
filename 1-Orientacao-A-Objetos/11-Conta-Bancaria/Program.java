package account.application;

import java.util.Locale;
import java.util.Scanner;

import account.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt(); 
		
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine(); 
		
		
		double deposit = 0; 
		System.out.println("Is there na initial deposit (y/n)? ");
		char respost = sc.nextLine().charAt(0);
		if (respost == 'y') {
			System.out.println("Enter initial deposit: ");
			deposit = sc.nextDouble();  
		}
		
		System.out.println();
		
		Account account = new Account(number, name, deposit); 
		
		System.out.println("Account data ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		account.makeDeposit(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: "); 
		account.makewithDraw(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		sc.close();
		
	
		

	}

}
