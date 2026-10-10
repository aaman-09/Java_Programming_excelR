package DAY4;

import java.util.Scanner;

public class Array_Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter person's age one by one: ");
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the age of person "+(i+1));
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("The age of Person " +(i+1) + " is " + arr[i]);
		}
		sc.close();
	}
}
