package DAY4;
import java.util.Scanner;

public class printPrimeNuminRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to Print All prime between it: ");
		int n = sc.nextInt();
		
		printPrime(n);
		
		sc.close();
	}
	
	private static void printPrime(int n) {
		for(int i=2; i<n; i++) {
			int flag = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag++;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}
}
