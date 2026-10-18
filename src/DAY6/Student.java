package DAY6;
import java.util.*;
public class Student {
	private int Roll;  //instance scope 
	private String name;             //these all are instance variable
	private double percentage; //local = instance scope
	
	private static String Principlename = "Robert"; //use static to shared with all, used global scope
	private static int schoolYearofEstb = 1986; //comman used among all students
	
	//create methods
	
	//constructer! with no args
	public Student() {   //constructer name must be same as class
		name = "Aaman";
		Roll = 77;
		percentage = 86.98;
	}
	//constructer! with args
	public Student(String a, int b, double c) {   //constructer name must be same as class
		name =a;
		Roll = b;
		percentage =c;
	}
	
	
	//Mthd 1
	public void RegStud() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your roll: ");
		Roll = sc.nextInt();
		System.out.println("Enter your percenatge: ");
		percentage = sc.nextDouble();
	sc.close();	
	}
	
	//to access private variables, create Getter and Setter!! 
	//Right clk< Source < Generate Getter and Setter < Select all. 
	public int getRoll() {    //Read Roll num.
		return Roll;
	}
	public void setRoll(int roll) {  //set Roll num
		Roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	//Mthd 2
	public void DispStud() {
		System.out.println("The name is: "+name);
		System.out.println("The roll is: "+Roll);
		System.out.println("The percentage is: "+percentage);
	}
	
	//mthd 3
	public boolean SearchStud(int rolln) {     
		if(Roll == rolln) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Polymorphism : 1. Function Overloading = Same funtion name, but differrnt parameters.
			//       2. Function Overriding = Same Function name, also same parameters
	
	public boolean SearchStudname(String Studname) {
		if(name.equalsIgnoreCase(Studname)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//main is in same code 
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student("Aaman",77,86.98); //new object with pre-defines constructer
////		s1.RegStud();
//		s1.DispStud();
//		
//		s2.DispStud();
//		
//		
//	}	
}
