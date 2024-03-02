package section18;

public class MyThread extends Thread{

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + (i+1);
		}
		System.out.println("sum = " + sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름: " + threadName);
	}
	
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름: " + threadName);
		
		MyThread th = new MyThread();
		th.start();
	}

}
