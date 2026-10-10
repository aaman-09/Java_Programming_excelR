package DAY4;

public class check_prime_array {
	public static void main(String[] args) {
		int arr[] = {23, 18, 25, 40, 29};
		
		System.out.println("Check Prime No. From Array's as Follow: ");
		
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			int flag = 0;
			
			for(int j=2; j<=Math.sqrt(num); j++) {
				
				if(num%j==0) {
					flag++;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("The Prime number is: " + num);
			}
		}
		
	}
}
