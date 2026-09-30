package DAY2;

import java.util.Scanner;

public class Condiition_statement {
	public static void main(String[] args1) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your percentage: ");
		
		double percentage = input.nextDouble();
		
		if(percentage>=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		System.out.println("Thank You!");
		input.close();
	}
}
