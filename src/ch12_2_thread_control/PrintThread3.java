package ch12_2_thread_control;

//interrupt 확인 클래스 

public class PrintThread3 extends Thread {
	
	public void run() { 
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) { // interrupt를 호출했는지 확인하고. 호출했으면 true로 break;
				break;	
			}	
		}	
		System.out.println("자원 정리");	
		System.out.println("실행 종료");
	}
}
