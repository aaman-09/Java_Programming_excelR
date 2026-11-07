package DAY14_Java_8_ft_pt2;
import java.util.*;
import java.util.stream.Collectors;

public class GrouppingbyDemo {
	public static void main(String[] args) {
		List<String> words = new ArrayList(Arrays.asList("One", "two", "Three", "four", "Five", "SIx", "Seven","Eight"));
		
		Map<Integer, List<String>> mp = words.stream()
				.collect(Collectors.groupingBy(word->word.length())); //groupingBy() groups elements that produce the same key
		
		System.out.println(mp);
	}
}
