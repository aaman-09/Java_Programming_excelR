package DAY8;

import java.util.Scanner;

public class Wholeseller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity: ");
		int qty = sc.nextInt();
		
		try {
		if(qty>=50) {
			System.out.println("Order Accpeted");
		}
		else {
			throw new LowQtyException("Please Contact Retailer");
			//Explicitly to throw the object of Custom exception
			//we use throw keyword
		}
		}
		catch(LowQtyException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
