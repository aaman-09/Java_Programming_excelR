package DAY11_Collections_pt1;
import java.util.*;
public class SetDemo2 {
	
	//In sets Insertion is not Preserved! randomly elements added
	public static void main(String[] args) {
		Set<String> months = new HashSet();
 		Set<Integer> s1 = new HashSet(Arrays.asList(1,2,3,4,5));
		Set<Integer> s2 = new HashSet(Arrays.asList(4,5,6,7,8));
		
		//Set is immutable!! ans it avoid Duplicates
		System.out.println(months);
		months.add("Jan");
		months.add("feb");
		months.add("March");
		months.add("Jan");
		months.add(null);
		months.add(null);
		System.out.println(months);
		
		
//		s1.addAll(s2);
//		System.out.println("Set1 Union Set2 "+s1);
		s1.retainAll(s2); 
		System.out.println("Set1 intersection Set2 "+s1);
	}
}
