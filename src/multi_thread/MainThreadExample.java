package multi_thread;

public class MainThreadExample {
	public static void main(String[] args) {

		Calculator calc = new Calculator();

		// 무명객체1 (User1 대신에)
		Thread jung = new Thread() {
			@Override
			public void run() {
				calc.setMemory(100);
			}
		};
		jung.setName("Jung's Thread");

		// 무명객체2 (User2 대신에)
		Thread park = new Thread(new Runnable() {
			@Override
			public void run() {
				calc.setMemory(50);
			}
		});
		park.setName("Park's Thread");

		jung.start();
		park.start();

//		User1 user1 = new User1();
//		user1.setCalculator(calculator);
//		user1.start();
//		
//		User2 user2 = new User2();
//		user2.setCalculator(calculator);
//		user2.start();
//		

	}

}
