package DAY11;
 class Alpha3 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread name: " +Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(true) {
			System.out.println("Good Morning!");
		}
	}
}
 class Beta3 implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread name: " +Thread.currentThread().getName());
		while(true) {
			System.out.println("Welcome Home");
		}
	}
}
public class MultiThreads3 {
	
	public static void main(String[] args) {
		Alpha3 t1 = new Alpha3();
		Beta3 t2  = new Beta3();
		
//		 Mthod 1
		Thread tn1 = new Thread(t1,"Aaman's Thread");
		Thread tn2 = new Thread(t2,"Rushi's Thread");
		tn1.start();
		tn2.start();
		
//		//Mthod 2
//		Thread Tx = null;
//		Tx = new Thread(t1);
//		Tx.start();               
//		Tx = new Thread(t2);
//		Tx.start();
		

	}
}
