package DAY5;

public class immutablestring {
	public static void main(String[] args) {
		String name = "Aaman";
		System.out.println(name);
		//name = name.concat(" Shaikh"); this used to
		String name1 = name.concat(" Shaikh");
		System.out.println(name);
		System.out.println(name1);
		
				
	}
}
