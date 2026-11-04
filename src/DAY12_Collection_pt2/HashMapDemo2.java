package DAY12_Collection_pt2;
import java.util.*;

public class HashMapDemo2 {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		int Even =0, Odd =0 ;
		
		//By Using HashMap
		Map<String, Integer> mp = new HashMap();
		mp.put("Even", 0);
		mp.put("Odd", 0);
		for(int n : num) {
			if(n%2==0) {
				mp.put("Even", mp.get("Even")+1);
			}
			else {
				mp.put("Odd", mp.get("Odd")+1);				
			}
		}
		System.out.println(mp);
		
		System.out.println("Even Numbers is: "+ mp.get("Even"));
		System.out.println("Odd Numbers is: "+ mp.get("Odd"));
	}	
}
