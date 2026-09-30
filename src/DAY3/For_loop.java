package DAY3;
import java.util.Scanner;
public class For_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("The code is printing " + i);
		}
		sc.close();
	}
}
