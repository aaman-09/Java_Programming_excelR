package DAY2;

import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		
		int age = input.nextInt();
		
		if(age >= 18 && age < 100) {
			System.out.println("You are an Adult");
		}
		else if (age<18 && age > 0) {
			System.out.println("You are Child");
		}
		else {
			System.out.println("Enter the valid age");
		}
	}
	
}
