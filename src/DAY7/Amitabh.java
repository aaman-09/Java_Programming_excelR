package DAY7;

public class Amitabh {
	public void home() {
		System.out.println("Home name is Jalsa");
	}
}

class Abhishek extends Amitabh {
	public void name() {
		System.out.println("My name is Abhishek & this is child class");
	}
}

//multi-level inheritance
class Aradhya extends Abhishek{
	public void school() {
		System.out.println("Aradhya school is VVVP ");
	}
}
