package DAY12_Collection_pt2;
import java.util.*;
public class TreeSetDemo2 {
	public static void main(String[] args) {
		Set<Student> FSDStudentsAttendance = new TreeSet();
		FSDStudentsAttendance.add(new Student("Aaman", 77, 87.8));
		FSDStudentsAttendance.add(new Student("Uday", 73, 89.1));
		FSDStudentsAttendance.add(new Student("Rushi", 64, 70.56));
		FSDStudentsAttendance.add(new Student("Jaydip", 63, 73.45));
		
		System.out.println("Display Student Roll Number-wise");  
		for(Student s : FSDStudentsAttendance) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Display Student by Percentage-wise");
		Set<Student> FSDStudentsExamResult = new TreeSet(new MarksCompare());  //used arksCompare() class
		FSDStudentsExamResult.add(new Student("Aaman", 77, 87.8));
		FSDStudentsExamResult.add(new Student("Uday", 73, 89.1));
		FSDStudentsExamResult.add(new Student("Rushi", 64, 70.56));
		FSDStudentsExamResult.add(new Student("Jaydip", 63, 73.45));
		
		for(Student s : FSDStudentsExamResult) {
			System.out.println(s);
		
	}
	}
}
