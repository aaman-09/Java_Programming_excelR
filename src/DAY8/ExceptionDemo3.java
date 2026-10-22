package DAY8;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {
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
		
//		String name = null;
//		System.out.println(name.length());
		
		}
		//use ex as showing user written exception
		// otherwise you can use ex.getMessage() for default msg
		//handle all exception using pipe operator!
		catch(ArithmeticException | InputMismatchException ex) {
			System.out.println("Please Enter Valid Input");
		}
		
		// default : for String 
		catch(Exception ex) {
			System.out.println("Some Error Occured");
		}
		System.out.println("Thank You!");
		sc.close();
		
	}
}
