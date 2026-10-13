package DAY5;

public class CountWords {
	public static void main(String[] args) {
		String name = "Mahendra Singh Dhoni";
		
		String word[] = name.split(" "); //creates an array of string!
		
		System.out.println("The total words in a string is : " + word.length);
	}
}
