package DAY11_Collections_pt1;

import java.util.*;

//same as Array list, but have some extra methods
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> mh1 = new LinkedList(Arrays.asList("Pune","Mumbai","Nagpur"));
		List<String> mh2 = new LinkedList(Arrays.asList("Pune","Mumbai","Nagpur"));
		
		System.out.println(mh1);
		System.out.println();
		System.out.println(mh2);
		
		mh1.addFirst("Pandharpur");
		mh1.addLast("Solapur");
		System.out.println(mh1);
		
		mh1.remove(3);
		System.out.println(mh1);
		
		mh1.removeLast();
		System.out.println(mh1);
		
		mh1.add(2, "Aurangabad");
		System.out.println(mh1);
		
	}
}
