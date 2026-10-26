package DAY11;


class Alpha extends Thread{
	@Override
	public void run() {
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
}

class Beta extends Thread{
	@Override
	public void run() {
		for(int i=101; i<=200; i++) {
			System.out.println("\t"+i);
		}
	}
}
public class MultiThreads {
	
	public static void main(String[] args) {
		Alpha t1 = new Alpha();
		Beta t2  = new Beta();
		
//		System.out.println("Thread Name: " + Alpha.currentThread().getName());
		t1.start();
//		System.out.println("Thread Name: " + Beta.currentThread().getName());
		t2.start();
	}
}
