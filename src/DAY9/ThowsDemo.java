package DAY9;
import java.util.*;
public class ThowsDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator: ");
		int numerator = sc.nextInt();
		System.out.println("Enter the denominator: ");
		int denominator = sc.nextInt();
		try {  		//caller to check Exception
			double ans = Divide(numerator, denominator);
			System.out.println(ans);	
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private static double Divide(int numerator, int Denominator) throws ArithmeticException {
		double result = numerator / Denominator; //methods focus on logic only
		return result;							 // it deligate the work to caller
												 // caller = main (for now) 
	}
}
