package section18;

class whiteFlag implements Runnable {
	@Override
	public void run() {
//		while (true) {
//			System.out.println("백기 올려");
//		}
	}
}

public class RunnableExample {

	public static void main(String[] args) {
//		Thread white = new Thread(new whiteFlag());
//		
//		white.start();
		Runnable white = () -> {
			int count = 0;
			
			Thread.currentThread().setName("⬜ 백기");
			String threadName = Thread.currentThread().getName();
			
			while (count < 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(threadName + "올려");
				count++;
			}
		};
		
		Runnable blue = () -> {
			int count = 0;
			
			Thread.currentThread().setName("🟦 청기");
			String threadName = Thread.currentThread().getName();
			
			while (count < 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(threadName + "올려");
				count++;
			}
		};
		
		Thread whiteFlag = new Thread(white);
		whiteFlag.start();
		Thread blueFlag = new Thread(blue);
		blueFlag.start();
		
	}

}
