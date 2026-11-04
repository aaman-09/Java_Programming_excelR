package DAY12_Collection_pt2;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap();
		
		map.put("Aalice", 150.00);
		map.put("Ben", 180.00);
		map.put("Jerry", 80.00);
		
		System.out.println(map);
		
		//Update the Salary
		map.put("Jerry", 800.00);
		System.out.println(map);
		
		//to get all keys
		for(String n : map.keySet()) {
			System.out.println(n);
		}
		
		//to get all values
		for(Double salary : map.values()) {
			System.out.println(salary);
		}
		
		//to get key-values pair
		for(Map.Entry<String, Double> en : map.entrySet()) {
			System.out.println(en.getKey() + " "+ en.getValue());
		}
		
		Double Max=0.0;
		for(Double salary : map.values()) {
			if(salary>Max) {
				Max = salary;
			}
		}
		System.out.println("Maximum Salary is: " + Max);
	}
}
