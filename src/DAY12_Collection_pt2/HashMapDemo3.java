package DAY12_Collection_pt2;
import java.util.*;

public class HashMapDemo3 {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		int Even =0, Odd =0 ;
		for(Integer n : num) {
			if(n%2==0) {
				Even++;
			}
			else {
				Odd++;
			}
		}
		System.out.println("Even Numbers is: "+ Even);
		System.out.println("Odd Numbers is: "+ Odd);
	}
	
}
