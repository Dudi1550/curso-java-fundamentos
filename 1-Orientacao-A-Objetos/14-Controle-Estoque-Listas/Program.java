package stocklist.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import stocklist.entities.Product;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n; 
		List<Product> list = new ArrayList<>(); 
		
			
		System.out.println("How many items are you going to register?");
		n = sc.nextInt(); 
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the id of product: ");
			int id = sc.nextInt(); 
			sc.nextLine();
			System.out.println("Enter the name of product");
			String name = sc.nextLine(); 
			System.out.println("Enter the quantity of product: ");
			int quantity = sc.nextInt();
			
			list.add(new Product(id, name, quantity));
		}
		System.out.println("---------------------------------");
		
		System.out.println("Enter the id of product you want");
		int id = sc.nextInt();
		
		Product pro = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); 
		
		if (pro != null ) {
			System.out.println("Add quantity of product: ");
			int amount = sc.nextInt();
			 pro.addQuantity(amount);
		}
		else {
				System.out.println("This id does not exist!");
			}
			
		
		for (Product p : list) {
		    System.out.println(p);
		}
			
		sc.close();
		
			
		}
		
		
	}


