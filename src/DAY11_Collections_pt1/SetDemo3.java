package DAY11_Collections_pt1;
import java.util.*;
public class SetDemo3 {
	
	//In sets Insertion is not Preserved! randomly elements added
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String name = sc.nextLine();
		
		char ch = findreapetedChar(name);
		System.out.println(ch==0 ? "Not found" : "Found char is "+ ch); 
		
	}
	
	//Using Functions
	private static char findreapetedChar(String name) {
		Set<Character> HS = new HashSet();
		for(char ch : name.toCharArray()) {
			if(HS.contains(ch)) {
				return ch;
			}
			else {
				HS.add(ch);
			}
		}
		return 0;
	}
}
