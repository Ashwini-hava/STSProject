package com.psl.demo;

public class Employee {
	private String firstName;
	private String lastName;
	private double hourlyRate;
	
	public Employee() {
       this.firstName = "john";
       this.lastName = "Doe";
       this.hourlyRate = 10;
       
guikjbhkmnjb
	}

	public Employee(String firstName, String lastName, double hourlyRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}

	public String getFirstName() {
	return firstName;
	}

	public static void setFirstName(String firstName) {
		
	}

	public String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public static void setHourlyRate(double hourlyRate) {

	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", hourlyRate=" + hourlyRate + "]";
	}
	
	public double getPayment(int hours)
	{
		return hours;
		
	}
	
	
	
}

