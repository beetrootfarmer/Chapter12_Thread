package ch12_3_example;

public class Account {
	// 잔고
	private int balance = 10_000;
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw (int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1 * 1000); 
			} catch(Exception e) {}
			
			balance -= money;
		}
	}

}
