package DAY11_Collections_pt1;

import java.util.*;

public class ItratorDemo {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList(Arrays.asList(1,2,3,4,5,6));
		ListIterator<Integer> itr = numbers.listIterator();
		
		while(itr.hasNext()) {
			Integer value = itr.next();
			if(value%2==1) {   // Odd Numbers logic
				itr.set(69);   // replace odd numbers with 69
			}
		}
		
		System.out.println(numbers);
	}
}
