package DAY9;
import java.util.*;
public class Student {
	private int Roll;  //instance scope 
	private String name;    //these all are instance variable
	private double percentage; //local = instance scope
	
	
	//create methods
	
	//constructer! with no args
	public Student() {   //constructer name must be same as class
		this.name = "Aaman";
		this.Roll = 77;
		this.percentage = 86.98;
	}
	//constructer! with args
	public Student(String name, int Roll, double percentage) {//constructer name must be same as class
		try {
		if(name==null) {
			throw new NullPointerException();
		}
		this.name =name;
		this.Roll = Roll;
		this.percentage =percentage;
		}
		catch(NullPointerException ex) {
			System.out.println("Invalid Details to create Object");
		}
	}

	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", name=" + name + ", percentage=" + percentage + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
