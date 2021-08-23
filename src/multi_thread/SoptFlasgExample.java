package multi_thread;

public class SoptFlasgExample {
	public static void main(String[] args) {
		
		PrintThread1 ptintThread = new PrintThread1();
		ptintThread.start();
	
		try { 
			Thread.sleep(1000); 
		} catch (Exception e ) {
			System.out.println("자원 정리");
			System.out.println("실행 종 ");
		}
		ptintThread.setStop(true);
	}
}
