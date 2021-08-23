package multi_thread;

class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	@Override
	public void run() {
		for(int i=0; i<2000; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	
}
class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}
	@Override
	public void run() {
		for(int i=0; i<2000; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	
}

public class ThreadNameExample {
	public static void main(String[] args) {
		
		// 너무추워 우째라미...
		
		// 이 코드를 실행하는 스레드 객체 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		// Thread A 객체 생성
		ThreadA threadA= new ThreadA();
		System.out.println("작업 스레드 이름: "+ threadA.getName());
		threadA.start();
		
		// Thread A 객체 생성
		ThreadB threadB= new ThreadB();
		System.out.println("작업 스레드 이름: "+ threadB.getName());
		threadB.start();
	}

}
