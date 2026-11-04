package DAY12_Collection_pt2;
import java.util.*;

public class TreeHashDemo
{
	public static void main(String[] args) {
		Set<String> names = new TreeSet();
		
		//It Created Binary Search Tree, its print O/P in Ascending Order of Alphabets
		names.add("Alice");
		names.add("Rajesh");
		names.add("Tom");
		names.add("Jerrry");
		names.add("Ben");
		names.add("Ben");
		
		System.out.println(names);
	}
}
