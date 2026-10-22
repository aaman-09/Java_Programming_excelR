package DAY8;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
//try and catch throw exception within try block
		Scanner sc = new Scanner(System.in);
		try {
		//Structure of Exception
		System.out.println("Enter the Numerator: ");
		int num = sc.nextInt();
		System.out.println("Enter the Denominator: ");
		int Den = sc.nextInt();
		double result = num / Den;
		System.out.println(result);
		
		String name = null;
		System.out.println(name.length());
		
		}
		//try block will through 2 exception so use multiple catch
		catch(ArithmeticException ex) {
			System.out.println("Please Enter Non-zero Denominator");
		}
		catch(InputMismatchException ex1) { //if wrong i/p type
			System.out.println("Please Enter Valid integer");
		}
		// default : for String 
		catch(Exception ex) {
			System.out.println("Some Error Occured");
		}
		System.out.println("Thank You!");
		sc.close();
		
	}
}
