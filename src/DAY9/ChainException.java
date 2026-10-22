package DAY9;

import java.util.Scanner;

public class ChainException {
	public static void main(String[] args) {
		try {
		int costofcarpet = getCost();
		System.out.println("The cost is: " + costofcarpet);
		}
		catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static int getCost() throws RuntimeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the carpet price per sq. feet");
		int carpetcostpersqfeet = sc.nextInt();
		System.out.println("Enter the length of room");
		int length = sc.nextInt();		
		System.out.println("Enter the Width of room");
		int width = sc.nextInt();
		
		Rectangle r1 = new Rectangle(length, width);
		r1.calculateArea();  //object!
		try {
		//return finalCost(carpetcostpersqfeet,null); thorws exceptions
		return finalCost(carpetcostpersqfeet,r1);
		}
		catch(NullPointerException ex) {
			System.out.println("Message to Dev. : Null pointer");
			throw new RuntimeException("Message to customer : Invalid Values");
		}
		
	}
	
	
	
	private static int finalCost(int carpetcostpersqfeet, Rectangle r1 ) throws NullPointerException {  //always write class variable in arguments
		return carpetcostpersqfeet*r1.calculateArea();
	}



	//class
	static class Rectangle {
		private int length;
		private int width;
		
		//Constructor
		public Rectangle() {}   
		public Rectangle(int length, int width) {
			this.length = length;
			this.width = width;
		}
		
		//method
		public int calculateArea() {
			return length*width;
		}
		
		
	}
}
