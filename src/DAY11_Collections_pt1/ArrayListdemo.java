package DAY11_Collections_pt1;
import java.util.List;
//Collections are Dynamic in size
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListdemo {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();  //Heterogenous list, which stores all data types
		
		list1.add(1); //int
		list1.add(1.5); //float, double
		list1.add("Aaman"); //String
		list1.add(new Student()); // Object
		
		System.out.println(list1);
		//int n = list1.get(0);  
		// this type of list always Gives overhead! bcoz at index 0 it is not fixed where the stored value is int or string
		
		//so always use Homogenous list type
		ArrayList<String> List2 = new ArrayList();
		
		//ArrayList Maintain Insertion order!! 
		List2.add("Aaman"); //["Aaman"]
		List2.add("Jaydip"); //["Aaman","Jaydip"]
		List2.add("Rushi"); //["Aaman","Jaydip","Rushi"]
		List2.add("Uday"); //["Aaman","Jaydip", "Rushi", "Uday"]
		//List2.add(77); it not stores Int data type 
		
		System.out.println(List2);
		System.out.println(List2.get(3));
		
		//To Add all Elements at once!
		//List<String> list3 = Arrays.asList("Alice","Jhon","Atharv", "Sachin"); //it is fixed size   
		List<String> list3 = new ArrayList(Arrays.asList("Alice","Jhon","Atharv", "Sachin")); //its variable
		
		list3.add("Raj");
		System.out.println(list3);
		
		//if we are in array we write syntax to found an element is given 
		String Search = "Sachin";
		int flag = 0;
		for(String word : list3) {
			if(word.equalsIgnoreCase(Search)) {
				System.out.println("Found");
				flag ++;
				break;
			}
		}
		 if (flag ==0)
				 System.out.println("Not found");
		
		 System.out.println(list3.size());
		 //But in Collections we have .contain method
		 if(list3.contains(Search)) {
			 System.out.println("Found at Index "+list3.indexOf(Search));
		 }
		 else
			 System.out.println("Not found" );
		
		 List<Integer> l1 = new ArrayList();  //Most Preferred and used
		 l1.add(1);
		 l1.add(2);
		 l1.add(3);
		 System.out.println(l1);
		 
		
	}
}
