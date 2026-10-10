package DAY4;

public class perfectnuminArray {
	public static void main(String[] args) {
		int arr[] = {23,17,6,40,28};
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			int num = arr[i];
			for(int j=1; j<arr[i]; j++) {
				if(num%j==0) {
					sum+=j;
				}
			}
			if(num==sum) {
				System.out.println("The perfect num is: "+num);
			}
		}
	}
}
