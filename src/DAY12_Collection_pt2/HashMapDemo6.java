package DAY12_Collection_pt2;
import java.util.*;

public class HashMapDemo6 {
	public static void main(String[] args) {
		String Str = "Virat Kohali";
//		Map<Character, Integer> mp = new HashMap();  //Gives Output in random Order
		Map<Character, Integer> mp = new LinkedHashMap();  //Gives Output in Maintainable order
		for(char ch : Str.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(mp);
	}
	
}
