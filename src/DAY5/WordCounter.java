package DAY5;

public class WordCounter {
	public static void main(String[] args) {
		String name = "Hello My name is Aaman";
		
		int wordcounter = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == ' ') {
				wordcounter+=1;
			}
		}
		System.out.println("The total words are: "+ (wordcounter + 1)); //always do arithmatic operation in()
	}
}
