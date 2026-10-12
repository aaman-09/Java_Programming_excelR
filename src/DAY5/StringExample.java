package DAY5;

public class StringExample {
	public static void main(String[] args) {
		String name = "Aaman";
		int age = 22;
		double height = 5.9;
		
		System.out.println(String.format("Hello My name is %s , I am %d year old, and my height is %.2f",name, age, height));
		//.2f used to lock only 2 decimals after point!
		System.out.printf("Hello My name is %s , I am %d year old, and my height is %f",name, age, height);	
		
		System.out.println();
		//write a table with left side spaces 
		System.out.println(String.format("%10s%5d","Tie",500));  
		System.out.println(String.format("%10s%5d","belt",1500));
		System.out.println(String.format("%10s%5d","Trouser",2500));
		System.out.println(String.format("%10s%5d","Total",4500));
		
		System.out.println();
		//write a table with left side spaces 
		System.out.println(String.format("%-10s%5d","Tie",500));  
		System.out.println(String.format("%-10s%5d","belt",1500));
		System.out.println(String.format("%-10s%5d","Trouser",2500));
		System.out.println(String.format("%-10s%5d","Total",4500));
	}
}
