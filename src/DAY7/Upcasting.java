package DAY7;

public class Upcasting {
	public static void main(String[] args) {
		int n = 5;
		double n1 = 5.9;
		
		Aradhya a1 = new Aradhya();
		show(a1);
		show(new Aradhya());
	}
	
	public static void test(int x) {} //for int 
	public static void test(double x) {} // for double
	
	public static void show(Aradhya x) {
		x.home();
		x.school();
		x.name();
	}
	
	public static Amitabh calculate() {
		return new Amitabh();
		//return new Abhishek    //it can return these all
		//return new Aaradhya
	}
}
