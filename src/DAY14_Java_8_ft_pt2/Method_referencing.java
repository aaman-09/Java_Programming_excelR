package DAY14_Java_8_ft_pt2;
import java.util.Arrays;

import DAY4.*;

public class Method_referencing {
	public static void main(String[] args) {
		int arr[] = {23, 18, 25, 40, 29};
		
		//basic Style
//		Arrays.stream(arr)
//		.filter(num->{
//			int flag = 0;
//			for(int i=2; i<=Math.sqrt(num); i++) {
//				if(num%i==0) {
//					flag++;
//					break;
//				}
//			}
//			if(flag==0) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		})
//		.forEach(num->System.out.println(num));
		
		
		//Method Referencing!
		Arrays.stream(arr)
		.filter(check_prime_array::checkprime)
		.forEach(n->System.out.println(n));
	}
}
