package DAY8;
import java.util.*;
public class NestedTryDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[2];
		
		try {
			System.out.println("Enter the Value for 0 index:");
			arr[0] = sc.nextInt();
			System.out.println("Enter the Value for 1 index:");
			arr[1] = sc.nextInt();
			
					try {
						System.out.println("choose index you want as numerator: ");
						int n = sc.nextInt();
						System.out.println("choose index you want as Denominator: ");
						int d = sc.nextInt();
						
						double result = (double)arr[n]/arr[d];
						System.out.println("result: "+ result);
					}
					catch(ArrayIndexOutOfBoundsException ex1) {
						System.out.println("Array out of bound");
					}
					catch(ArithmeticException ex) {
						System.out.println("Denominator must be NON-zero");
						
					}
		}
		catch(InputMismatchException ex) {
			System.out.println("Please Enter int value only");
		}
		sc.close();
	}
} 
