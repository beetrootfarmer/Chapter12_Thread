package multi_thread;

import java.awt.Toolkit; //windowTool . window어플 관련 클래스 
//import javax.swing.JFrame; // window창 하나 만드는 클래스
//
//class MyFrame extends JFrame {
//	public MyFrame () {
//		setTitle("나의 윈도우 프레임");
//		setSize(300,500);
//		setVisible(true);
//	}
//}

public class BeepPrintExample1 {
	public static void main(String[] args) {
//		메인 스레드만 이용한 경우
		/*
		 *  0.5초 주기로 beep음 발생 후 문자 출력 
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}for ( int i=0; i<5; i++ ) {
			System.out.println(i+1 +"띵~");
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		
	}

}
