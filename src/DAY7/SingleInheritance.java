package DAY7;

public class SingleInheritance {
	public static void main(String[] args) {
		Abhishek a1 = new Abhishek();
		//ref variable = object 
		//child red = child class
		
		a1.home();
		a1.name();
		
		Amitabh a2 = new Abhishek();
		//Parent ref = child class
		// limitation is, it only uses parents class methods!! not it's own!
		a2.home();  //it is called as UpCasting, and it's used very much
		//a2.name(); it not allows to use child class methd
		
		Amitabh a3 = new Aradhya();
		a3.home();
		Abhishek a4 = new Aradhya();
		a4.home();
		a4.name();
		Aradhya a5 = new Aradhya();
		a5.home();
		a5.name();
		a5.school();
		
	}
}
