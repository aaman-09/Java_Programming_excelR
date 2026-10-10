package DAY4;

import java.util.Scanner;

public class Function_scenario2 {
	public static void main(String[] args) {
		double result = arearect(); 
		System.out.println("The area is : "+result);
	}

	private static double arearect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth: ");
		double breadth = sc.nextDouble();
		
		double area = length * breadth;
		
		return area;
		
	}
}
