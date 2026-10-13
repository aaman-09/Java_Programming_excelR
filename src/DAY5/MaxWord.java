package DAY5;

public class MaxWord {
	public static void main(String[] args) {
		String name = "Mahendra Singh Dhoni is LallantopBatsman";
		
		String words[] = name.split(" ");
		
		int max = 0;
		String maxWord = words[0];
		
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>max) {
				max = words[i].length();
				maxWord = words[i];
			}
		}
		System.out.println("The biggest word in string is "+ maxWord +" With having " + max + " words");
	}
}
