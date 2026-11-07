package DAY4;

public class check_prime_array {
	public static void main(String[] args) {
		int arr[] = {23, 18, 25, 40, 29};
		
		System.out.println("Check Prime No. From Array's as Follow: ");
		for(int i=0; i<arr.length; i++) {
			if(checkprime(arr[i])) {
				System.out.println(arr[i]); 
			}
		}
		
	}
	
	public static boolean checkprime(int num) {
		int flag = 0;
		for(int j=2; j<=Math.sqrt(num); j++) {
			if(num%j==0) {
				flag+=1;
				break;
			}
		}
		if(flag==1) {
			return false;
		}
		else {
			return true;
		}
	}
}
