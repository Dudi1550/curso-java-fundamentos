package student.application;

import java.util.Locale;
import java.util.Scanner;

import student.entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter student name: ");
		student.name = sc.nextLine();
		System.out.println("Enter the three grades: ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble(); 
		
		System.out.println(student);
		
		if (student.finalGrade() < 60) {
			System.out.println("FAILED "); 
			System.out.println("MISSING " + String.format("%.2f ", student.missing() + " POINTS"));
			
		}
		else {
			System.out.println("PASS");
		}

		sc.close();
		
	}

}
