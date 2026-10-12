package DAY5;

public class MaxNuminArray {
	public static void main(StringExample[] args) {
		int arr [] = {10,8,9,16,12};
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
