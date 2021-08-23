package ch12_2_thread_control;

public class InterruptExample {
	public static void main(String[] args) {
		
		Thread thread = new PrintThread3();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		
		//스레드를 종료하기 위해 InterruptThread를 발생시킨다.
		thread.interrupt();
	}

}


