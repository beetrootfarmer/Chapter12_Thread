package ch12_2_thread_control;

import java.util.Arrays;

public class AutoSaver extends Thread{
	private int[] arr;
	private int count;
	
	public AutoSaver(int lenght) {
		arr = new int[lenght];
		count = 0;
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			try {Thread.sleep(300);} catch(Exception e) {}
			if(count < arr.length -1 ) {
				save(i++);
			}
			
		}
	}
	private void save(int num) { //save는 내부에서만 쓰기때문에 private으로 해 놓음 
		arr[count++] = num;
		System.out.println(num + " 을 저장합니다.");
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
		
	}
}
