package DAY6;

import java.util.Scanner;

class employee extends Person {
	Scanner sc = new Scanner(System.in);
	protected int eno;
	protected String Designation;
	protected Double Salary;
	
	//always use no args constructor too for GOOD Practice
	public employee() {};
	public employee(int eno, String designation, Double salary) {
		super();
		this.eno = eno;
		Designation = designation;
		Salary = salary;
	}
	
	public void Regemployee() {
		System.out.println("Enter your Employee Num.: ");
		eno = sc.nextInt();
		System.out.println("Enter your Designation: ");
		Designation = sc.next();
		System.out.println("Enter your Salary: ");
		Salary= sc.nextDouble();
	}
																		// this having 3 attribute
																		// this having 4 methods(include constructor)
	public void Dispemployee() {
		System.out.println("your ID is: "+eno);
		System.out.println("Designation is: "+Designation);
		System.out.println("Your Salary is : "+Salary);
	}
}
