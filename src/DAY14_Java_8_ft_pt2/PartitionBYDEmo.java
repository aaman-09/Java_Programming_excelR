package DAY14_Java_8_ft_pt2;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class PartitionBYDEmo {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList(Arrays.asList(1,2,3,4,5));
		
		Map<Boolean,List<Integer>> hashmap = numbers.stream()
				.collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println(hashmap);
		
		//downStream
		Map<Boolean, Long> mp = numbers.stream()
				.collect(Collectors.partitioningBy(n->n%2==0,Collectors.counting()));
		System.out.println(mp);
	}
}
