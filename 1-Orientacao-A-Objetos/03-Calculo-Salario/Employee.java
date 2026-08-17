package employee.entities;

public class Employee {
	
	public String name; 
	public double glossSalary; 
	public double tax;
	
	public double netSalary() {
		return glossSalary - tax; 
	}
	
	public void increseSalary (double percentage) {
	 glossSalary += glossSalary * percentage / 100.00; 
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f ", netSalary()); 
	}
}
