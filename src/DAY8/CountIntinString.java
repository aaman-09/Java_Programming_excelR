package DAY8;

public class CountIntinString {
	public static void main(String[] args) {
		String s1 = "Hi, My name is Alice and I have 2 brothers and 1 sister and I am 9 year Old";
		
		String Words[] = s1.split(" ");
		
		int Counter=0;
		for(String word : Words) {
			try {
				int n1 = Integer.parseInt(word); 
				Counter+=1;
			}
			catch(NumberFormatException ex) {
				
			}
		}
		System.out.println("The Total numbers in Strings are: "+Counter);
	}
}
