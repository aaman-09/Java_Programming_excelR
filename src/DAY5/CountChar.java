package DAY5;

public class CountChar {
	public static void main(String[] args) {
		String name = "Mahendra Singh Dhoni";
		
		String words[] = name.split(" ");
		
		for(String word : words) {  //put itrator word in words array!! it same as (for word in words)
			System.out.println(word+" "+word.length());
		}
	}
}
