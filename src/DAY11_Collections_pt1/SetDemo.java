package DAY11_Collections_pt1;
import java.util.*;
public class SetDemo {
	
	//In sets Insertion is not Preserved! randomly elements added
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String name = sc.nextLine();
		
		Set<Character> HS = new HashSet();
		for(char ch : name.toCharArray()) {
			if(HS.contains(ch)) {
				System.out.println("The Reapeated char is: " + ch);
				break;
			}
			else {
				HS.add(ch);
			}
		}
	}
}
