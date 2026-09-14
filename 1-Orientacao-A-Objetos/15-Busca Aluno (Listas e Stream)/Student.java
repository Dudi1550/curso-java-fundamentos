package student.entities;

public class Student {
	
	private Integer registration; 
	private String name;
	private Double grade;
	
	public Student(Integer registration, String name, Double grade) {
		this.registration = registration;
		this.name = name;
		this.grade = grade;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return registration + ", " + name + ", " + grade;
	}

	
	
	
	

}
