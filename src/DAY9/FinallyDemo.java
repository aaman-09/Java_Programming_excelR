package DAY9;

import java.util.Scanner;

public class FinallyDemo {
	
	//finally block always executed!! if exception ocuured or not!! 
	//when we entered try block, then we also entered in finally block!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator: ");
		int numerator = sc.nextInt();
		System.out.println("Enter the denominator: ");
		int denominator = sc.nextInt();
		try {  		//caller to check Exception
			int ans = numerator / denominator;
			System.out.println(ans);	
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Thank You! Visit Again");
		}
	}
}
