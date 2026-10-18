package DAY6;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	//always remember write all class variable before main class
	protected String name;
	protected int age;
	protected String Address;
	
	//generate constructor with and without args for GOOD practice
	// constructor is also called as method!***
	public Person() {}
	public Person(String name, int age, String address) {
//		super();  used only when you have parent class, but this class is base/super/main class 
		this.name = name; 
		this.age = age;       // when name is same use this. keyword
		Address = address;    //when name is not same don't use this. keyword
	}
	
	public void RegPerson() {
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your Address: ");
		Address = sc.next();

	}
																		// this having 3 attribute
																		// this having 4 methods(include constructor)
	public void DispPerson() {
		System.out.println("The name is: "+name);
		System.out.println("The age is: "+age);
		System.out.println("The Address is: "+Address);
	}
	
}

//public class Employee extends Person  --> don't write public before child class
//class Employee extends Person {
//	protected int eno;
//	protected String Designation;
//	protected Double Salary;
//	
//	//always use no args constructor too for GOOD Practice
//	public Employee() {};
//	public Employee(int eno, String designation, Double salary) {
//		super();
//		this.eno = eno;
//		Designation = designation;
//		Salary = salary;
//	}
//	
//	public void RegEmployee() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your Employee Num.: ");
//		eno = sc.nextInt();
//		System.out.println("Enter your Designation: ");
//		Designation = sc.next();
//		System.out.println("Enter your Salary: ");
//		Salary= sc.nextDouble();
//		sc.close();	
//	}
//																		// this having 3 attribute
//																		// this having 4 methods(include constructor)
//	public void DispEmployee() {
//		System.out.println("your ID is: "+eno);
//		System.out.println("Designation is: "+Designation);
//		System.out.println("Your Salary is : "+Salary);
//	}
//}

