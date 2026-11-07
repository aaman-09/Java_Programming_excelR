package DAY13_Java_8_Ft_pt1;
import java.security.KeyStore.Entry;
import java.util.*;

public class StreamingAPIdemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("----Imperative Style----");
		List<Integer> Oddnums = new ArrayList();
		for(int n: numbers) {
			if(n%2==1) {    //Odd Number Logic
				Oddnums.add(n);
			}
		}
		
		List<Integer> OddnumsSquare = new ArrayList();
		for(int n: Oddnums) {
			int Square = n*n;
			OddnumsSquare.add(Square);
		}
		
		//Just for map Understanding!
////	Map<Integer, Integer> mp = new HashMap();
//		for(int n:numbers) {
//			if(n%2==1) {
//				int key = n;
//				int square = n*n;
//				mp.put(key, square);
//			}
//		}
//		System.out.println(mp);
//		
//		for(<>)
		
		for(int n : OddnumsSquare) {
			System.out.println(n);
		}
		
		System.out.println("----Functional Style----");
		
		numbers.stream()
		.filter(n->n%2==1) //.filter is used when i/p size is not equal to o/p size --> 1,3,5,7,9
		.map(n->n*n)       //.map is used when i/p size is equal to o/p size --> 1,9,25,49,81
		.forEach(n->System.out.println(n)); //for output
		
		//display sum of square of all odd numbers
		int result = numbers.stream()
		.filter(n->n%2==1)
		.map(n->n*n)
		.reduce(0,(acc,n)->acc+n );
		
		System.out.println("The sum of all Odd numbers is: "+result);

	}
}
