package DAY2;
import java.util.Scanner;
public class Check_Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks to check the result: ");
		int marks = sc.nextInt();
		
		if(marks>=75) {
			System.out.println("Pass with Destinction");
		}
		else if(marks>=45 && marks<75) {
			System.out.println("Pass with A");
		}
		else if(marks>=28 && marks<45){
			System.out.println("Pass with B");
		}
		else {
			System.out.println("FAIL, better luck next time");
		}

	}
}
