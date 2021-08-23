package ch12_2_thread_control;

public class DaemonExample {
	public static void main(String[] args) {
	
		AutoSaver autoSaver = new AutoSaver(20); //괄호에 배열개수 넣어주도록 지정해놓음 
		autoSaver.setDaemon(true);
		
		if(autoSaver.isDaemon()) {
		autoSaver.start();
		}
		
		System.out.println("스레드 수: " + Thread.activeCount() );
		
		try {
			Thread.sleep(5);
		} catch(Exception e) {}
		
		autoSaver.print();
		
		System.out.println(Thread.currentThread().getName());
		}
	}

