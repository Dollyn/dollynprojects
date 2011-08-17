package thread;

public class TestThread {
	
	static int i = 0;
	static int j = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					try {
						TestThread.i++;
						TestThread.j++;
						sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread1:---" + i);
				}
			}
			
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					try {
						TestThread.i++;
						TestThread.j++;
						sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread2:---" + i);
				}
			}
			
		};
		
		try {
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("end");
	}

}
