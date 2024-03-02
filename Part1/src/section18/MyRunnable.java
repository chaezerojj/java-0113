package section18;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(i + "초");
		}
	}
	
	public static void main(String[] args) {
		Thread th = new Thread(new MyRunnable());
		th.start();
	}
}
