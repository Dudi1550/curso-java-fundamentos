package account.entities;

public class Account {
	
	private int number; 
	private String name; 
	private double balance;
	
	public Account() {
		
	}
	
	public Account (int number, String name, double deposit) {
		this.number = number; 
		this.name = name; 
		this.balance = deposit;
	}
	
	public Account (int number, String name) {
		this.number = number; 
		this.name = name; 
	}
	
	public int getNumber() {
		return number; 
	}
	
	public String getName () {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void makeDeposit (double deposit) {
		this.balance += deposit; 
	}
	
	public void makewithDraw (double deposit) {
		this.balance -= deposit + 5.0 ; 
	}
	
	public String toString() {
		return "Account "    
		+ number
		+ ", Holder: "
		+ name 
		+ ", Balance " 
		+ String.format("%.2f ", getBalance());
	}

}
