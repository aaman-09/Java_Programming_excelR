package DAY10;

class BankMethods{
	private double balance;
	
	public BankMethods(double balance) {
		this.balance = balance;
	}

	//getter
	public double getBalance() {
		return balance;
	}
	
	//methods 
	public synchronized void Withdraw(double WithdrawAMT) {
		if(WithdrawAMT>balance) {
			System.out.println("Insufficiant Amount! Withdraw Amount is " + WithdrawAMT);
			try {
				wait();   //son will waiting for 10 Sec to get deposite notification
			}
			catch(Exception e) {
				
			}
			balance-=WithdrawAMT;
			System.out.println("Amount Withdraw successfull!");
			System.out.println("The Updated balance is: " + balance);
			
		}
	}
	public synchronized void deposite(double DepositeAMT) {
		balance+=DepositeAMT;
		System.out.println("Amount Deposited SuccessFull!!");
		notify();    //notified to son
	}
}

class son extends Thread{
	BankMethods b;   
	public son(BankMethods b) {   //Passed Object Stored in Instance Variable
		this.b=b;
	}
	
	@Override
	public void run() {
		b.Withdraw(10000.0);
	}
}


class father extends Thread{
	BankMethods b;  //Passed Object Stored in Instance Variable
	public father(BankMethods b) {
		this.b=b;
	}
	
	@Override
	public void run() {
		try {    
			Thread.sleep(10000);  //10 sec interval
		}
		catch(Exception e) {
			
		}
		b.deposite(20000.0);
	}
}

public class Bank {
public static void main(String[] args) {
	BankMethods b = new BankMethods(5000.0); //object is created
	
	son thread1 = new son(b);			//Object is Passed to Son and Father Class 
	father thread2 = new father(b);
	
	thread1.start();    //Run Methods Triggers Father and Son
	thread2.start();
	
}
}
