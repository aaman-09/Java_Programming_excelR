package DAY14_Java_8_ft_pt2;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class PartitionBYDEmo2 {
	public static void main(String[] args) {
		List<String> Months = Arrays.asList("January","February","March","April",
				"May","June","July","August",
				"September","October","November","December");
		
		Map<Boolean, List<String>> hashmap = Months.stream()
				.collect(Collectors.partitioningBy(M->M.endsWith("ber")));
		
		System.out.println(hashmap);
		System.out.println("Display Months that ends with 'ber' ");
		System.out.println(hashmap.get(true));
		
	
				
		
	}
}
