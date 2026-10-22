package DAY9;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Aaman",77,86.90);
		System.out.println(s1);
		
		Student s2 = new Student(null, 77, 86.90);
		System.out.println(s2);
		
	}
}
