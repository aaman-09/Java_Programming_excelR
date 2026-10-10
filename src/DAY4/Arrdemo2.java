package DAY4;
import java.util.Scanner;

public class Arrdemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the numbers one by one: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+".");
			arr[i] = sc.nextInt();
		};
		
		
		System.out.println("Entered array is: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("All odds numbers in arrays are: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.print(arr[i]+" ");
			}
		};
		System.out.println();
		System.out.println("All odds numbers in arrays are: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=2; j<Math.sqrt(arr[i]); j++) {
				if(arr[i]%j!=0) {
					System.out.print(arr[i]);
				}
			}
		}
		
		
		sc.close();
	}
}
