package account.application;

import java.util.Locale;
import java.util.Scanner;

import account.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt(); 
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine(); 
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char respost = sc.nextLine().charAt(0);
		if (respost == 'y') {
			System.out.println("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();  
			account = new Account(number, holder, initialDeposit); 
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		
		
		System.out.println("Account data ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: "); 
		account.withdraw(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		sc.close();
		
	
		

	}

}
