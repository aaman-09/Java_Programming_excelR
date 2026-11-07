package DAY13_Java_8_Ft_pt1;
import java.security.KeyStore.Entry;
import java.util.*;

public class StreamingAPIdemo2 {
	public static void main(String[] args) {
		List<String> Months = Arrays.asList("January","February","March","April",
				"May","June","July","August",
				"September","October","November","December");
		
		
		List<Integer> lenOfMonths = Months.stream()
		.map(m->m.length())
		.toList();
		
		System.out.println(lenOfMonths);
		System.out.println();
		
		//diplay months which have > 5 character
		Months.stream()
		.filter(m->m.length()>5)   //.filter is used to filter out instead of .map 
		.forEach(m->System.out.println(m));
		System.out.println();
		
		//dipla how many months which have > 5 character
		long ans = Months.stream() //use long! 
		.filter(m->m.length()>5)
		.count(); 
		System.out.println(ans);
		System.out.println();
		
		//diplay months which have < 5 character
		Months.stream()
		.filter(m->m.length()<5)
		.forEach(m->System.out.println(m));
				
	}
}
