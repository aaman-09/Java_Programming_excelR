package DAY12_Collection_pt2;
import java.util.*;

public class Student implements Comparable<Student>{
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
	
	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", name=" + name + ", percentage=" + percentage + "]";
	}
	@Override
	public int compareTo(Student s1) {  //Comparison Roll Number
		if(this.Roll>s1.Roll){
			return 1;
		}
		else if(this.Roll<s1.Roll) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

	
		

}
