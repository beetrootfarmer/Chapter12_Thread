package multi_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//생성자안에 익명객체를 만들어서넣어주기 
		Thread th = new Thread( new Runnable() {
		
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for ( int i=0; i<5; i++ ) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {}
				}
			}
		});
		th.start();
	
		for ( int i=0; i<5; i++ ) {
			System.out.println(i+1 +"띵~");
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		
	}

}
