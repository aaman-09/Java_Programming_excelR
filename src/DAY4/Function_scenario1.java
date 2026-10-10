package DAY4;
import java.util.Scanner;
public class Function_scenario1 {
	public static void main(String[] args) {
		arearect();
	}

	private static void arearect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth: ");
		double breadth = sc.nextDouble();
		
		double area = length * breadth;
		
		System.out.println("The Area is: "+area);
		sc.close();
	}
}
