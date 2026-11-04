package DAY12_Collection_pt2;
import java.util.*;

public class HashMapDemo5 {
	public static void main(String[] args) {
		String Sentence = "one two three one three one five six six five four nine";
		
		String words[] = Sentence.split(" ");
		System.out.println(words); //it 
		System.out.println(Arrays.toString(words));  
		
		Map<String, Integer> mp = new HashMap();
		for(String word : words) {
			mp.put(word, mp.getOrDefault(word, 0)+1);
		}
		
		System.out.println(mp);
	}
	
}
