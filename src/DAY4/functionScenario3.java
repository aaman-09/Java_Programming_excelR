package DAY4;
import java.util.Scanner;
public class functionScenario3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lenght: ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth	: ");
		int breadth = sc.nextInt();
		
		int result = arearect(length, breadth);
		System.out.println("The area is: "+result);
		
		sc.close();
	}
	
	private static int arearect(int a, int b) {
		int area = a * b;
		return area;
	}
}
