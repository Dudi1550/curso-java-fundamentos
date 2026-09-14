package book.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import book.entities.Book;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n; 
		
		System.out.println("Enter book quantity: ");
		n = sc.nextInt(); 
		
		List<Book> list = new ArrayList<>(); 
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the isbn: ");
			int isbn = sc.nextInt();
			while (hasIsbn(list, isbn)) {
				System.out.println("ISBN already digitized, try again: ");
				isbn = sc.nextInt();
			}
			sc.nextLine();
			System.out.println("Enter the title of book");
			String title = sc.nextLine();
			
			System.out.println("Enter the price: ");
			double price = sc.nextDouble();
			
			list.add(new Book(isbn, title, price));
			
		}
		
		System.out.println("How much pay for book: ");
		double Maxprice = sc.nextDouble();
		
		List<Book> book = list.stream().filter(x -> x.getPrice() <= Maxprice).collect(Collectors.toList()); 
		
		for (Book x : book) {
			System.out.println(x);
		}
		
		sc.close();
		
	}
	
	public static boolean hasIsbn(List<Book>list, int isbn) {
		Book book = list.stream().filter(x -> x.getIsbn() == isbn).findFirst().orElse(null);
		return book != null;
	}

}
