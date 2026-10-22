package DAY8;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		//Upcasting in Exception same as classes and object
	
		int num = 10;
		int denomi = 0;
		try {
		double result = num / denomi;
		System.out.println(result);
		}
		//catch(Throwable ex){} //Grandfather
		//catch(Exception ex){} //father       		//upcasting
		catch(RuntimeException ex) { //son    
			System.out.println(ex.getMessage());
		}
		System.out.println("Hi");
	}
}
