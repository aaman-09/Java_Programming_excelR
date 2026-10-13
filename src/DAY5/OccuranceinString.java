package DAY5;

public class OccuranceinString {
	public static void main(String[] args) {
		String sentence = "one two Three One Eight one nine Two one";
		String search = "one";
		
		String words[] = sentence.split(" ");
		
		int occuranceCounter = 0;
		
		for(String word : words) {
			if(word.equalsIgnoreCase(search)) {   //it egnores upper and lower case
				occuranceCounter++;
					}
			}
		System.out.println(occuranceCounter);
	}
}

	

