package section18;

class AddStackThread extends Thread {
	private Storage storage;
	
	public AddStackThread(Storage storage) {
		this.storage = storage;
	}
	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class PopStackThread extends Thread {
	private Storage storage;
	
	public PopStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
					System.out.println("짐 3개 나르기");
					this.storage.popStack(3);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadWaitExample {

	public static void main(String[] args) {
		Storage s = new Storage();
		AddStackThread add = new AddStackThread(s);
		add.start();
		PopStackThread pop = new PopStackThread(s);
		pop.start();
	}

}
