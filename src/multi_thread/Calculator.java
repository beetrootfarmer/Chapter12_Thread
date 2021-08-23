package multi_thread;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory; 
		
		try {
			Thread.sleep(2 * 1000); //단위를 빠르게 알 수 있게 2000이 아닌 2*1000으로 
		} catch (Exception e){}
			System.out.println(Thread.currentThread().getName() + ": " + this.getMemory());
			
		
		
	}
}
