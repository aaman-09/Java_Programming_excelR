package DAY11_Collections_pt1;

import java.util.*;
//2D Collection
public class ListOFList {
	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune","Mumbai","Nagpur"));
		List<String> rj = new ArrayList(Arrays.asList("Jaipur","Bikaner","Kota"));
		
		System.out.println(mh.size());
		System.out.println(rj.size());
		
		List<List<String>> india = new ArrayList();
		india.add(mh);
		india.add(rj);
		System.out.println(india.size());
		
		System.out.println(india.get(0).get(0)); //pune : India index 0 : mh index 0 : pune
		System.out.println(india.get(0).get(1));
		System.out.println(india.get(0).get(2));
		System.out.println();
		System.out.println(india.get(1).get(0));
		System.out.println(india.get(1).get(1));
		System.out.println(india.get(1).get(2));
	}
}
