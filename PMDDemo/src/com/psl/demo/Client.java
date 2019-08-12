package com.psl.demo;

public class Client {
	
	public static void main(String[] args) {
		Employee employee = new Employee("victor", "smith", 10);
		Employee.setFirstName("victor");
		Employee.setLastName("smith");
		Employee.setHourlyRate(10);
		
		System.out.println(employee.toString());
		
		System.out.println(employee.getPayment(40));
	ghbjn,jbgkyghv
		
	}

}
