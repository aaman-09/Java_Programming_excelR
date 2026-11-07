package DAY12_Collection_pt2;
import java.util.*;
public class HashMapDemo7 {

	public static void main(String[] args) {
		List<String> words = new ArrayList(Arrays.asList("One", "two", "Three", "four", "Five", "SIx", "Seven","Eight"));
		
		Map<Integer, List<String>> mp = new HashMap();
		
		for(String word : words) {
			int key = word.length();
			//putIfAbsent = check the key already present or not! it avoid key Overwrite!
			mp.putIfAbsent(key, new ArrayList()); //ex. 3 = [] empty array list
			
			mp.get(key).add(word);   // now it be key = 3 --> 3.add(one) == 3 = ["One"]; 
		}
		
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());
	}
}
