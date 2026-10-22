package DAY8;

import java.util.Scanner;

public class Name{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = sc.nextLine();  //print full name with space
//		String name = sc.next();  //print only 1st letter
		try {
			if(name.contains(" ")) {
				throw new InValidNameException("Invalid Name! Space is not Allowed");
			}
			else {
				System.out.println("your name is: " + name);
			}
		}
		catch(InValidNameException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
//	static class InValidNameException extends Exception {
//		// constructor same as class name
//		public InValidNameException(String msg) {
//			super(msg);
//		}
//	}
}
