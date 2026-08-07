

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		int X , Y; 
		
		System.out.println("Digite dois numeros: ");
		X = sc.nextInt();
		Y = sc.nextInt(); 
		
		while (X != Y) { 
			if (X < Y) {
				System.out.println("Crescente ");
			}
			else {
				System.out.println("Decrescente ");
			}
			System.out.println("Digite outros dois numeros: ");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		sc.close();
	}

}
