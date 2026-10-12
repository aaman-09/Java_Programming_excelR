package DAY4;

public class PrimeNumUsingFunc {
	public static void main(String[] args) {
		int arr[] = {23,18,25,40,29};
		
		for(int i=0; i<arr.length; i++) {
			checkprime(arr[i]);
		}
	}

	private static void checkprime(int num) {
		int flag = 0;
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			
			if(num%i==0) {
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("The Prime number is: " + num);
		}
		
	}
}
 