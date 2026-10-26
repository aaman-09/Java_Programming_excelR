package DAY9;

class Sleep1 extends Thread {
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
			System.out.println(i);
		}
	}
	
}
class Sleep2 extends Thread {
	public void run() {
		for(int i=11; i<=20; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
			System.out.println("\t"+i);
		}
	}
	
}

public class SleepDemo {
	public static void main(String[] args) {
		Sleep1 s1 = new Sleep1();
		Sleep2 s2 = new Sleep2();
		
		s1.start();
		s2.start();
	}
}
