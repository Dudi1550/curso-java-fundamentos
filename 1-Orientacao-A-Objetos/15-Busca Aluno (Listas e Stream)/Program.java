package student.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import student.entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n; 
		List<Student> list = new ArrayList<>();

		System.out.print("Enter students numbers ");
		n = sc.nextInt(); 
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Enter student registration ");
			int registration = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter student name: ");
			String name = sc.nextLine(); 
			System.out.println("Enter student grade: ");
			double grade = sc.nextDouble();
			System.out.println("---------------------");
			
			list.add(new Student(registration, name, grade));
		}
		
		List<Student> lis = list.stream().filter(x -> x.getGrade() >= 7.0).collect(Collectors.toList());
		
		System.out.println("Aprovved students: ");
		for (Student x : lis) {
			System.out.println(x);
		}
		
		System.out.println();
		
		System.out.println("Search registred: ");
		int registred = sc.nextInt();
		
		Student li = list.stream().filter(x -> x.getRegistration() == registred).findFirst().orElse(null);
		
		if (li != null) {
			System.out.println();
			System.out.println(li);
		}
		else {
			System.out.println("Registration " + registred +" found in list");
		}
		
		sc.close();
	}

}
