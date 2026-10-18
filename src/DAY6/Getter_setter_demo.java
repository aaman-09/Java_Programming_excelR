package DAY6;

public class Getter_setter_demo {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.RegStud();
		s1.DispStud();   		//This are public can be accessed
		
		//private 
		//s1.Roll(); 	Cannot be accessed because it's private!
		
		//To access private we have to set Getter and setter in main class. for Ex. in Student class
		s1.setRoll(45);
		System.out.println("The Roll num is "+ s1.getRoll());
	}
}
