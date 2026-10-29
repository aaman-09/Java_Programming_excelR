package DAY10;


class Alpha1 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("Good Morning!");
		}
	}
}

class Beta1 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("Welcome Home");
		}
	}
}
public class MultiThreads2 {
	
	public static void main(String[] args) {
		Alpha1 t1 = new Alpha1();
		Beta1 t2  = new Beta1();
		
//		System.out.println("Thread Name: " + Alpha.currentThread().getName());
		t1.start();
//		System.out.println("Thread Name: " + Beta.currentThread().getName());
		t2.start();
	}
}
