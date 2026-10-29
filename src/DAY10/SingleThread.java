package DAY10;

public class SingleThread {
	public static void main(String[] args) {
		System.out.println("Thread name is: " + Thread.currentThread().getName());
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		for(int i=101; i<=200; i++) {
			System.out.println("\t"+i);
		}
		
	}
}
