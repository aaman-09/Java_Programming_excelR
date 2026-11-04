package DAY12_Collection_pt2;
import java.util.*;

public class HashsetDemo2
{
	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet();
		
		//LinkedHashSet Preserve Insertion Order!
		names.add("Alice");
		names.add("Rajesh");
		names.add("Tom");
		names.add("Jerrry");
		names.add("Ben");
		names.add("Ben");
		
		System.out.println(names);
	}
}
