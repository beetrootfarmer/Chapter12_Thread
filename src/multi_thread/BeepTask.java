package multi_thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	/**
	 *  소리와 글자가 같이 나타나게 
	 */
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	public void run () {
	for (int i=0; i<5; i++) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
	}
}
}

