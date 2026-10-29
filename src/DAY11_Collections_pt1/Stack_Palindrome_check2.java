package DAY11_Collections_pt1;

import java.util.Stack;

public class Stack_Palindrome_check2 {
	public static void main(String[] args) {
		Stack<Character> s = new Stack();
		
		String name = "1221";
		
		for(char ch : name.toCharArray()) {
			s.push(ch);
		}
		
		System.out.println(s);
		
		int flag = 0;
		for(char ch : name.toCharArray()) {
			if(ch!=s.pop()) {
				flag = 1;
				break;
			}
		}
		
		System.out.println(flag == 1 ? "Not Palidrome" : "Palindrome");
	}
}
